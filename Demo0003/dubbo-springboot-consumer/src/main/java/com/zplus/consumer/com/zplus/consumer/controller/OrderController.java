package com.zplus.consumer.com.zplus.consumer.controller;

import com.zplus.api.model.User;
import com.zplus.consumer.com.zplus.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        return orderService.getUserList();
    }
}
