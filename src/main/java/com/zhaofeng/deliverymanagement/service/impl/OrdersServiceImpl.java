package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.pojo.OrdersPojo;
import com.zhaofeng.deliverymanagement.repository.OrdersMapper;
import com.zhaofeng.deliverymanagement.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public List<OrdersPojo> getOrdersByUserId(Integer userId) {
        return ordersMapper.selectOrdersByUserId(userId);
    }

    @Override
    public JsonResult getUncompletedOrdersByUserId(Integer userId) {
        List<OrdersPojo> orderList = ordersMapper.selectUncompletedOrdersByUserId(userId);
        if (orderList == null || orderList.isEmpty()) {
            return new JsonResult("无记录");
        }

        return new JsonResult(orderList);
    }

    @Override
    public JsonResult getOrdersByUserIdAndCustomerId(Integer userId, Integer customerId) {
        List<OrdersPojo> orderList = ordersMapper.selectOrdersByUserIdAndCustomerId(userId, customerId);
        if (orderList == null || orderList.isEmpty()) {
            return new JsonResult("无记录");
        }

        return new JsonResult(orderList);
    }

    @Override
    public JsonResult addOrders(Orders orders) {
        ordersMapper.insertSelective(orders);
        return new JsonResult();
    }

    @Override
    public JsonResult deleteOrderById(Integer id) {
        ordersMapper.deleteByPrimaryKey(id);
        return new JsonResult();
    }

}
