package com.hduzplus.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.hduzplus.model.User;
import com.hduzplus.service.UserService;

@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

	public List<User> getUserList() {
		User u1 = new User(1, "aaa");
		User u2 = new User(2, "bbb");
		return Arrays.asList(u1, u2);
	}

}
