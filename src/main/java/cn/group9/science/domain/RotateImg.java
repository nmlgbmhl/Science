package cn.group9.science.domain;

import java.sql.Date;

/**
 * [轮播图表](RotateImg)
 * @author LZH
 * @version V1.0
 * @description zh - 轮播图表
 * @description en - RotateImg
 * @since 2021/12/22 10:52
 */
public class RotateImg {
	private int id;
	private String address;
	private int adminId;
	private Date gmtCreate;
	private Date gmtModified;

	public RotateImg() {
	}

	public RotateImg(int id, String address, int adminId, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.address = address;
		this.adminId = adminId;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "RotateImg{" +
			"id=" + id +
			", address='" + address + '\'' +
			", adminId=" + adminId +
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
