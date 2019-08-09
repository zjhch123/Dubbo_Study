package com.zplus.consumer.com.zplus.consumer.service;

import com.zplus.api.model.User;
import com.zplus.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Reference
    UserService userService;

    public List<User> getUserList() {
        return userService.getUserList();
    }
}
