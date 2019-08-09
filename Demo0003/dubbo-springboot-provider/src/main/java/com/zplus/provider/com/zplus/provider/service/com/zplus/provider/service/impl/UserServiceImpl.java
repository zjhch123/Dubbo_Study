package com.zplus.provider.com.zplus.provider.service.com.zplus.provider.service.impl;

import com.zplus.api.model.User;
import com.zplus.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public List<User> getUserList() {
        User u1 = new User(1, "666");
        User u2 = new User(2, "777");
        return Arrays.asList(u1, u2);
    }
}
