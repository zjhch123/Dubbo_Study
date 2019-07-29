package com.hduzplus.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hduzplus.dubbo.model.User;
import com.hduzplus.dubbo.service.OrderService;
import com.hduzplus.dubbo.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;
	
	@Override
	public void initOrder() {
		List<User> userList = userService.getUserList();
		
		System.out.println(userList);
	}

}
