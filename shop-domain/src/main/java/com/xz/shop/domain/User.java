package com.xz.shop.domain;


import lombok.Data;

@Data
public class User extends Base{
    private Integer id;
    private String userName;
    private String userPassword;

}
