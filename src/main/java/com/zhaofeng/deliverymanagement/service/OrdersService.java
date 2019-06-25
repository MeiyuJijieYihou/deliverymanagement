package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Orders;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

public interface OrdersService {
    JsonResult getOrdersByUserId(Integer userId);

    JsonResult getUncompletedOrdersByUserId(Integer userId);

    JsonResult getOrdersByUserIdAndCustomerId(Integer userId, Integer customerId);

    JsonResult addOrders(Orders orders);
}
