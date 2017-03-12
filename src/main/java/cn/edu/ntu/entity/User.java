package cn.edu.ntu.entity;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 存储到memcache中对象需可以序列化
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户唯一标识
	 */
	private int userId;
	/**
	 * 用户名
	 */
	private String userName;
	
	
	public User(String userName){
		this.userName = userName;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
