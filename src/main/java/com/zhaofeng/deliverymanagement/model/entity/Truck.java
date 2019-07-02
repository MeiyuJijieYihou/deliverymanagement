package com.zhaofeng.deliverymanagement.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Truck {

    private Integer id;

    private String licensePlate;

    private Integer userId;

    private Double maxCapacity;

    private Date recentUsageTime;

    private Date usageCount;

}