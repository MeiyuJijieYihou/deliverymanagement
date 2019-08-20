package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Address;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
public interface AddressMapper extends Mapper<Address> {

    /**
     * 根据客户id获取地址
     *
     * @param
     * @return 
     */
    List<Address> selectByCustomerId(Integer customerId);
}