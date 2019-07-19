package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.DeliveryLoader;

public interface DeliveryLoaderMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(DeliveryLoader record);

    int insertSelective(DeliveryLoader record);

    DeliveryLoader selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeliveryLoader record);

    int updateByPrimaryKey(DeliveryLoader record);
}