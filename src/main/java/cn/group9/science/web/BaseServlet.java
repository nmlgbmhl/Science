package cn.group9.science.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * [设置反射使用调用对象的指定方法](Set reflection to use the specified method of the calling object)
 * @author LZH
 * @version V1.0
 * @description zh - 设置反射使用调用对象的指定方法
 * @description en - Set reflection to use the specified method of the calling object
 * @since 2021/12/24 9:10
 */
public class BaseServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/json;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		// 1.获取请求路径
		// 请求资源标识符   范围更大
		String uri = req.getRequestURI();

		// 2.获取方法名称  save  add  del
		String methodName = uri.substring(uri.lastIndexOf("/") + 1);

		try {
			// 3.先获取当前对象的字节码，获取一个公开的方法
			Method method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
			// 4.执行方法
			method.invoke(this, req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
