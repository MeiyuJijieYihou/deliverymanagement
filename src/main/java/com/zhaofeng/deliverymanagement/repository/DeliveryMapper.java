package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import com.zhaofeng.deliverymanagement.pojo.DeliveryPojo;
import com.zhaofeng.deliverymanagement.pojo.SimpleDeliveryPojo;

import java.util.Date;
import java.util.List;

public interface DeliveryMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);
    
    /**
     * 根据用户id获取所有发货记录简介
     *
     * @param
     * @return 
     */
    List<DeliveryPojo> selectDeliveryByUserId(Integer userId);


    List<SimpleDeliveryPojo> selectDeliveryBySearchParam(Integer userId, String licensePlate, String realname, Date fromDate, Date toDate);
}