package com.hduzplus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hduzplus.model.User;
import com.hduzplus.service.UserService;

@Service
public class OrderService {

	@Reference(version="1.0.0")
	UserService userService;
	
	public List<User> getUserList() {
		return userService.getUserList();
	}
	
}
