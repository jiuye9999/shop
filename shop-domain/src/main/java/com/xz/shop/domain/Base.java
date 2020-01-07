package com.xz.shop.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Base {

    private Date createTime;
    private Date updateTime;
    private Byte delete;
    private Date ts;
}
