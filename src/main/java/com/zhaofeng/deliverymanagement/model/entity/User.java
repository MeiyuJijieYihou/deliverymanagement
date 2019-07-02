package com.zhaofeng.deliverymanagement.model.entity;

import lombok.Data;

@Data
public class User {

    private Integer id;

    private String username;

    private String password;

    private String realname;

    private String phone;

    private Integer jobId;

    private String remark;

    private Integer ownerId;
}