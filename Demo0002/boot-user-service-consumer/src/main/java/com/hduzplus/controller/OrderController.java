package com.hduzplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hduzplus.model.User;
import com.hduzplus.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@ResponseBody
	@RequestMapping("/initOrder")
	public List<User> initOrder() {
		return orderService.getUserList();
	}
}
