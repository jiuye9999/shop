package com.xz.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@PropertySource(value = "application.properties",encoding = "utf-8")
public class ShopCenterController {
private static final Logger log= LoggerFactory.getLogger(ShopCenterController.class);


    @RequestMapping(value = "/login",method={RequestMethod.GET,RequestMethod.POST})
    public String login(){
        log.info("日志测试xz###############");
        return "xz";
    }

}
