package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.service.DeliveryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;


    @PostMapping("/getDeliveryByUserId")
    @ApiOperation("根据用户id获取发货记录")
    public JsonResult getDeliveryByUserId(Integer userId) {
        return deliveryService.getDeliveryByUserId(userId);
    }
}
