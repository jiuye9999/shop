package com.xz.shop;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.xz.*"})
@PropertySource(value = {"classpath:application.properties"}, encoding="utf-8")

public class ShopCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopCenterApplication.class,args); }
}
