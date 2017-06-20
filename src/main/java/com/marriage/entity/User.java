package com.marriage.entity;

/**
 * 用户实体
 */
public class User {

	private long userId;// 用户ID

	private String username;// 用户名称

	private String password;//密码

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}

	public User(long userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}
public User(String username,String password){
	super();
	this.username=username;
	this.password=password;
}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



}
