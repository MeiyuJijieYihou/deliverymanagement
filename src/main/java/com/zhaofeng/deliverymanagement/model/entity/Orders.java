package com.zhaofeng.deliverymanagement.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Orders {

    private Integer id;

    private Integer customerId;

    private Integer addressId;

    private Integer cementId;

    private Double unitPrice;

    private Double num;

    private Date createdTime;

    private Integer userId;

    private Integer deliveryId;
}