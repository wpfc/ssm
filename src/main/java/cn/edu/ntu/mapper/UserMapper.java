package cn.edu.ntu.mapper;

import cn.edu.ntu.entity.User;

public interface UserMapper {

	public User queryUserById(int userId);
	
	public int insertUser(User user);
	
}
