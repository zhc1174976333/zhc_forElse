package com.zhc.service.Impl;

import org.springframework.stereotype.Service;

import com.zhc.Entity.UserEntity;
import com.zhc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	public String getUserInfo(UserEntity user) {
		String sex = user.getSex()==1 ?"ÄÐ":"Å®";
		String msg = "USERNAME:"+user.getUserName()+"£¬ PASSWORD:"+user.getPassword()+"£¬ SEX:"+sex;
		return msg;
	}

}
