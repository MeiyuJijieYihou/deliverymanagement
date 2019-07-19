package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Address;

import java.util.List;

public interface AddressMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);


    /**
     * 根据客户id获取地址
     *
     * @param
     * @return 
     */
    List<Address> selectByCustomerId(Integer customerId);
}