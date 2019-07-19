package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.model.params.OrdersParam;
import com.zhaofeng.deliverymanagement.model.params.search.OrdersSearchParam;
import com.zhaofeng.deliverymanagement.pojo.OrdersPojo;
import com.zhaofeng.deliverymanagement.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@RestController
@RequestMapping("/api/orders")
@Api(description = "订单相关接口文档")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @GetMapping("/all/{userId}")
    @ApiOperation("根据用户id获取订单")
    public List<OrdersPojo> getOrdersByUserId(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
        return ordersService.getOrdersByUserId(userId);
    }

    @GetMapping("/uncompleted/{userId}")
    @ApiOperation("根据用户id获取未完成订单")
    public JsonResult getUncompletedOrdersByUserId(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
        return ordersService.getUncompletedOrdersByUserId(userId);
    }

    @GetMapping("/{userId}/{customerId}")
    @ApiOperation("根据用户id和客户id获取订单")
    public JsonResult getOrdersByUserIdAndCustomerId(@ApiParam("用户id") Integer userId,
                                                     @ApiParam("客户id") Integer customerId) {
        return ordersService.getOrdersByUserIdAndCustomerId(userId, customerId);
    }

    @PostMapping("/search")
    @ApiOperation("根据搜索参数获取订单")
    public List<OrdersPojo> getOrdersBySearchParam(@ApiParam("订单搜索参数") OrdersSearchParam ordersSearchParam) {
        return ordersService.getOrdersBySearchParam(ordersSearchParam);
    }

    @PostMapping("/add")
    @ApiOperation("添加订单")
    public JsonResult addOrders(@ApiParam("订单信息") OrdersParam ordersParam) {
        Orders orders = ordersParam.convertTo();
        return ordersService.addOrders(orders);
    }

    @DeleteMapping("/delete/{orderId}")
    @ApiOperation("删除订单")
    public JsonResult deleteOrder(@ApiParam("订单id") @PathVariable("orderId") Integer orderId) {
        return ordersService.deleteOrderById(orderId);
    }
}
