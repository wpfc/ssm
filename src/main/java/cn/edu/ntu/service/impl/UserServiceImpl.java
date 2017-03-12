package cn.edu.ntu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ntu.entity.User;
import cn.edu.ntu.mapper.UserMapper;
import cn.edu.ntu.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User queryUserById(int userId) {
		User user = userMapper.queryUserById(userId);
		return user;
	}

	@Override
	public int insertUser(User user) { 
		int count = 0;
		userMapper.insertUser(user);
		System.out.println("成功啦...");
		
//		if(true){
//			throw new RuntimeException("error");
//		}
//		
//		User user1 = new User("张二麻子");
//		userMapper.insertUser(user1);
//		System.out.println("成功啦...");
		return count;
	}

}
