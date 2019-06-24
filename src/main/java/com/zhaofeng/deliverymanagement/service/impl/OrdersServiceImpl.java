package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.common.RtCode;
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
    public JsonResult getAllOrdersByUserId(Integer userId) {
        List<OrdersPojo> orderList = ordersMapper.selectAllOrdersByUserId(userId);
        if (orderList == null || orderList.isEmpty()) {
            return new JsonResult("无记录");
        }

        return new JsonResult(orderList);
    }

}
