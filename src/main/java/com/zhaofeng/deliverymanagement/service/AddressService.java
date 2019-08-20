package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.model.params.AddressParam;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

public interface AddressService {
    /**
     * 根据客户id获取地址
     *
     * @param customerId
     * @return
     */
    List<Address> getAllAddressByCustomerId(Integer customerId);

    JsonResult addAddress(Address address);
}
