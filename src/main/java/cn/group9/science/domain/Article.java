package cn.group9.science.domain;

import java.sql.Date;

/**
 * [文章表](Article)
 * @author LZH
 * @version V1.0
 * @description zh - 文章表
 * @description en - Article
 * @since 2021/12/22 10:51
 */
public class Article {
	private int id;
	private int userId;
	private int categoryId;
	private String title;
	private String subTitle;
	private String content;
	private int condition;
	private int	adminId;
	private boolean isDelete;
	private Date gmtCreate;
	private Date gmtModified;

	public Article() {
	}

	public Article(int id, int userId, int categoryId, String title, String subTitle, String content, int condition, int adminId, boolean isDelete, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userId = userId;
		this.categoryId = categoryId;
		this.title = title;
		this.subTitle = subTitle;
		this.content = content;
		this.condition = condition;
		this.adminId = adminId;
		this.isDelete = isDelete;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "Article{" +
			"id=" + id +
			", userId=" + userId +
			", categoryId=" + categoryId +
			", title='" + title + '\'' +
			", subTitle='" + subTitle + '\'' +
			", content='" + content + '\'' +
			", condition=" + condition +
			", adminId=" + adminId +
			", isDelete=" + isDelete +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean delete) {
		isDelete = delete;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
}
