package cn.group9.science.domain;

import java.sql.Date;

/**
 * [类别表](Category)
 * @author LZH
 * @version V1.0
 * @description zh - 类别表
 * @description en - Category
 * @since 2021/12/22 10:52
 */
public class Category {
	private int id;
	private int adminId;
	private String name;
	private Date gmtCreate;
	private Date gmtModified;

	public Category() {
	}

	public Category(int id, int adminId, String name, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.adminId = adminId;
		this.name = name;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "Category{" +
			"id=" + id +
			", adminId=" + adminId +
			", name='" + name + '\'' +
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

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
