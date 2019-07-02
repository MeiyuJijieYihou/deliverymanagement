package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.model.params.AddressParam;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

public interface AddressService {
    JsonResult getAllAddressByCustomerId(Integer customerId);

    JsonResult addAddress(Address address);
}
