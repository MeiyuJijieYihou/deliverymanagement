package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.service.OrdersService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @GetMapping("/all")
    @ApiOperation("根据用户id获取订单")
    public JsonResult getOrdersByUserId(Integer userId) {
        return ordersService.getOrdersByUserId(userId);
    }

    @GetMapping("/uncompleted")
    @ApiOperation("根据用户id获取订单")
    public JsonResult getUncompletedOrdersByUserId(Integer userId) {
        return ordersService.getUncompletedOrdersByUserId(userId);
    }

    @GetMapping("/{userId}/{customerId}")
    @ApiOperation("根据用户id和客户id获取订单")
    public JsonResult getOrdersByUserIdAndCustomerId(Integer userId, Integer customerId) {
        return ordersService.getOrdersByUserIdAndCustomerId(userId, customerId);
    }

    @PostMapping("/add")
    @ApiOperation("添加订单")
    public JsonResult addOrders(Orders orders) {
        return ordersService.addOrders(orders);
    }
}
