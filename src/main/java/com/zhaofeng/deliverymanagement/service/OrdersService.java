package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.pojo.OrdersPojo;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

public interface OrdersService {
    List<OrdersPojo> getOrdersByUserId(Integer userId);

    JsonResult getUncompletedOrdersByUserId(Integer userId);

    JsonResult getOrdersByUserIdAndCustomerId(Integer userId, Integer customerId);

    JsonResult addOrders(Orders orders);

    JsonResult deleteOrderById(Integer id);
}
