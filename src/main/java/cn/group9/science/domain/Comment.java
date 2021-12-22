package cn.group9.science.domain;

import java.sql.Date;

/**
 * [评论表](Comment)
 * @author LZH
 * @version V1.0
 * @description zh - 评论表
 * @description en - Comment
 * @since 2021/12/22 10:52
 */
public class Comment {
	private int id;
	private int articleId;
	private int userId;
	private boolean isDelete;
	private Date gmtCreate;
	private Date gmtModified;

	public Comment() {
	}

	public Comment(int id, int articleId, int userId, boolean isDelete, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.articleId = articleId;
		this.userId = userId;
		this.isDelete = isDelete;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "Comment{" +
			"id=" + id +
			", articleId=" + articleId +
			", userId=" + userId +
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

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
