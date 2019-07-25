package com.hduzplus.dubbo.service.impl;

import java.util.Arrays;
import java.util.List;

import com.hduzplus.dubbo.model.User;
import com.hduzplus.dubbo.service.UserService;

public class UserServiceImpl implements UserService {

	public List<User> getUserList() {
		User u1 = new User(1, "aaa");
		User u2 = new User(2, "bbb");
		return Arrays.asList(u1, u2);
	}

}
