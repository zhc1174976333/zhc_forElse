package com.zhc.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhc.Entity.UserEntity;
import com.zhc.service.UserService;

@ParentPackage("basePackage")
@Action(value="user")
@Namespace("/")
public class UserAction {
	
	@Autowired
	private UserService userService;
	
	public void test() {
		UserEntity user = new UserEntity();
		user.setUserName("ÍÐÄá¡¤ÅÁ¿Ë");
		user.setPassword("123123");
		user.setSex(1);
		
		String msg = userService.getUserInfo(user);
		
		System.out.println(msg);
	}

}
