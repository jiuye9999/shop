package com.xz.shop.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@PropertySource(value = "application.properties",encoding = "utf-8")
public class ShopCenterController {


    @RequestMapping(value = "/login",method={RequestMethod.GET,RequestMethod.POST})
    public String login(){
        return "xz";
    }

}
