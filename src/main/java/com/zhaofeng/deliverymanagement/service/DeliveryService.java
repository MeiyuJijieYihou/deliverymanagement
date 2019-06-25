package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

public interface DeliveryService {
    JsonResult getDeliveryByUserId(Integer userId);
}
