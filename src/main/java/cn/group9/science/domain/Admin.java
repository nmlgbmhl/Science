package cn.group9.science.domain;

import java.sql.Date;

/**
 * [管理员表](admin)
 * @author LZH
 * @version V1.0
 * @description zh - 管理员表
 * @description en - admin
 * @since 2021/12/22 10:51
 */
public class Admin {
	private int id;
	private String account;
	private String name;
	private String cipher;
	private Date gmtCreate;
	private Date gmtModified;

	public Admin() {
	}

	public Admin(int id, String account, String name, String cipher, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.account = account;
		this.name = name;
		this.cipher = cipher;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "Admin{" +
			"id=" + id +
			", account='" + account + '\'' +
			", name='" + name + '\'' +
			", cipher='" + cipher + '\'' +
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCipher() {
		return cipher;
	}

	public void setCipher(String cipher) {
		this.cipher = cipher;
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
