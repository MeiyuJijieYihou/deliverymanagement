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
    List<Address> getAllAddressByCustomerId(Integer customerId);

    JsonResult addAddress(Address address);
}
