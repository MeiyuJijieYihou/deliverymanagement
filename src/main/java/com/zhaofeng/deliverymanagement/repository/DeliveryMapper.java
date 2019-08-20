package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import com.zhaofeng.deliverymanagement.pojo.DeliveryPojo;
import com.zhaofeng.deliverymanagement.pojo.SimpleDeliveryPojo;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface DeliveryMapper extends Mapper<Delivery> {
    
    /**
     * 根据用户id获取所有发货记录简介
     *
     * @param
     * @return 
     */
    List<DeliveryPojo> selectDeliveryByUserId(Integer userId);


    List<SimpleDeliveryPojo> selectDeliveryBySearchParam(Integer userId, String licensePlate, String realname, Date fromDate, Date toDate);
}