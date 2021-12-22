package cn.group9.science.domain;

import java.sql.Date;

/**
 * [收藏表](Collect)
 * @author LZH
 * @version V1.0
 * @description zh - 收藏表
 * @description en - Collect
 * @since 2021/12/22 10:52
 */
public class Collect {
	private int id;
	private int userId;
	private int articleId;
	private Date gmtCreate;
	private Date gmtModified;

	public Collect() {
	}

	public Collect(int id, int userId, int articleId, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userId = userId;
		this.articleId = articleId;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "Collect{" +
			"id=" + id +
			", userId=" + userId +
			", articleId=" + articleId +
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

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
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
