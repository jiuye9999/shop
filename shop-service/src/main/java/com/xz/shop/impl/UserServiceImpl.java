package com.xz.shop.impl;

import com.xz.shop.dao.UserDao;
import com.xz.shop.domain.User;
import com.xz.shop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
