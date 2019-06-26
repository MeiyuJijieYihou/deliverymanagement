package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.model.params.OrdersParam;
import com.zhaofeng.deliverymanagement.service.OrdersService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @GetMapping("/all")
    @ApiOperation("根据用户id获取订单")
    public JsonResult getOrdersByUserId(@ApiParam("用户id") Integer userId) {
        return ordersService.getOrdersByUserId(userId);
    }

    @GetMapping("/uncompleted")
    @ApiOperation("根据用户id获取订单")
    public JsonResult getUncompletedOrdersByUserId(@ApiParam("用户id") Integer userId) {
        return ordersService.getUncompletedOrdersByUserId(userId);
    }

    @GetMapping("/{userId}/{customerId}")
    @ApiOperation("根据用户id和客户id获取订单")
    public JsonResult getOrdersByUserIdAndCustomerId(@ApiParam("用户id") Integer userId,
                                                     @ApiParam("客户id") Integer customerId) {
        return ordersService.getOrdersByUserIdAndCustomerId(userId, customerId);
    }

    @PostMapping("/add")
    @ApiOperation("添加订单")
    public JsonResult addOrders(@ApiParam("订单信息") OrdersParam ordersParam) {
        Orders orders = ordersParam.convertTo();
        return ordersService.addOrders(orders);
    }
}
