package cn.group9.science.domain;

import java.sql.Date;

/**
 * [图片表](Image)
 * @author LZH
 * @version V1.0
 * @description zh - 图片表
 * @description en - Image
 * @since 2021/12/22 10:52
 */
public class Image {
	private int id;
	private int userId;
	private int articleId;
	private String title;
	private String address;
	private int condition;
	private int adminId;
	private boolean isDelete;
	private Date gmtCreate;
	private Date gmtModified;

	public Image() {
	}

	public Image(int id, int userId, int articleId, String title, String address, int condition, int adminId, boolean isDelete, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userId = userId;
		this.articleId = articleId;
		this.title = title;
		this.address = address;
		this.condition = condition;
		this.adminId = adminId;
		this.isDelete = isDelete;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "Image{" +
			"id=" + id +
			", userId=" + userId +
			", articleId=" + articleId +
			", title='" + title + '\'' +
			", address='" + address + '\'' +
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

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
