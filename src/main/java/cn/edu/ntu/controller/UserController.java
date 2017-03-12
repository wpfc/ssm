package cn.edu.ntu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ntu.entity.User;
import cn.edu.ntu.mapper.UserMapper;
import cn.edu.ntu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/queryUserList")
	public String queryUserList(Model model){
		User user = null;
		user = (User) memcacheClient.get("user");
		if(user == null){
			System.out.println("===从数据库获取数据。。。===");
			user = userService.queryUserById(1);
			memcacheClient.set("user", 60000, user);
		}
		System.out.println("userid : " + user.getUserId() + "userName : "+user.getUserName());
		model.addAttribute("user", user);
		return "/userList";
	}
	
	@RequestMapping("/insertUser")
	public void insertUser(){
		userService.insertUser(new User("wpfc"));
	}
	
}
