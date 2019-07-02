package com.zhaofeng.deliverymanagement.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Delivery {

    private Integer id;

    private Integer truckId;

    private Integer driverId;

    private Date deliveryTime;

    private Date createdTime;

    private Integer userId;
}