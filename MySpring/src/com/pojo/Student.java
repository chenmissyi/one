package com.pojo;

import java.util.Date;

public class Student {
	String username;
	String pwd;
	Date birthday;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String username, String pwd, Date birthday) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.birthday = birthday;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	
}
