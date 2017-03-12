package cn.edu.ntu.service;

import cn.edu.ntu.entity.User;

public interface UserService {

	public User queryUserById(int userId);
	
	public int insertUser(User user);
	
}
