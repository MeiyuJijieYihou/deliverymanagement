package com.zhaofeng.deliverymanagement.model.entity;

import lombok.Data;

@Data
public class Address {

    private Integer id;

    private String addressName;

    private Integer customerId;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getAddressName() {
//        return addressName;
//    }
//
//    public void setAddressName(String addressName) {
//        this.addressName = addressName;
//    }
//
//    public Integer getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(Integer customerId) {
//        this.customerId = customerId;
//    }
}