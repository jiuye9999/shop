package com.xz.shop.controller;

import com.xz.shop.domain.User;
import com.xz.shop.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;



    @RequestMapping(value = "getUserList",method = {RequestMethod.GET,RequestMethod.POST})
    private List<User> getUserList(){
        return userService.getUserList();
    }

}
