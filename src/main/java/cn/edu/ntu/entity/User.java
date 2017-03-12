package cn.edu.ntu.entity;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * �洢��memcache�ж�����������л�
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �û�Ψһ��ʶ
	 */
	private int userId;
	/**
	 * �û���
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
