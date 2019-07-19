package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import com.zhaofeng.deliverymanagement.model.params.DeliveryParam;
import com.zhaofeng.deliverymanagement.model.params.search.DeliverySearchParam;
import com.zhaofeng.deliverymanagement.pojo.DeliveryPojo;
import com.zhaofeng.deliverymanagement.pojo.SimpleDeliveryPojo;
import com.zhaofeng.deliverymanagement.service.DeliveryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@RestController
@RequestMapping("/api/delivery")
@Api(description = "发货记录相关接口文档")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;


    @GetMapping("/{userId}")
    @ApiOperation("根据用户id获取发货记录")
    public List<DeliveryPojo> getDeliveryByUserId(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
        return deliveryService.getDeliveryByUserId(userId);
    }

    @PostMapping("/search")
    @ApiOperation("根据搜索参数获取发货记录")
    public List<SimpleDeliveryPojo> getDeliveryBySearchParam(@ApiParam("搜索参数")DeliverySearchParam deliverySearchParam) {
        return deliveryService.getDeliveryBySearchParam(deliverySearchParam);
    }

    @PostMapping("/add")
    @ApiOperation("添加发货记录")
    public JsonResult addDelivery(@ApiParam("发货记录信息") @Valid DeliveryParam deliveryParam) {
        Delivery delivery = deliveryParam.convertTo();
        return deliveryService.addDelivery(delivery, deliveryParam.getOrderIds(), deliveryParam.getLoaderIds());
    }
}
