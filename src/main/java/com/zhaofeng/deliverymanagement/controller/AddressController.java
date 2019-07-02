package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.model.params.AddressParam;
import com.zhaofeng.deliverymanagement.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Slf4j
@RestController
@RequestMapping("/api/address")
@Api(description = "地址相关接口文档")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/{customerId}")
    @ApiOperation("根据客户id获取地址")
    public JsonResult getAllAddressByCustomerId(@ApiParam("客户id") @PathVariable("customerId") Integer customerId) {
        log.info("" + customerId);
        return addressService.getAllAddressByCustomerId(customerId);
    }

    @PostMapping("/add")
    @ApiOperation("添加地址")
    public JsonResult addAddress(@ApiParam("地址参数") AddressParam addressParam) {
        Address address = addressParam.convertTo();
        return addressService.addAddress(address);
    }

}
