package cn.group9.science.domain;

import java.sql.Date;

/**
 * [用户表](User)
 * @author LZH
 * @version V1.0
 * @description zh - 用户表
 * @description en - User
 * @since 2021/12/22 10:52
 */
public class User {
	private int id;
	private String account;
	private String name;
	private String cipher;
	private int gender;
	private String phone;
	private Date birthday;
	private Date gmtCreate;
	private Date gmtModified;

	public User() {
	}

	public User(int id, String account, String name, String cipher, int gender, String phone, Date birthday, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.account = account;
		this.name = name;
		this.cipher = cipher;
		this.gender = gender;
		this.phone = phone;
		this.birthday = birthday;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}


	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", account='" + account + '\'' +
			", name='" + name + '\'' +
			", cipher='" + cipher + '\'' +
			", gender=" + gender +
			", phone='" + phone + '\'' +
			", birthday=" + birthday +
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
