package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Cement;
import com.zhaofeng.deliverymanagement.service.CementService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@RestController
@RequestMapping("/api/cement")
public class CementController {
    @Autowired
    private CementService cementService;

    @GetMapping("/")
    @ApiOperation("获取所有水泥信息")
    public JsonResult getAllCement() {
        return cementService.getAllCement();
    }

    @GetMapping("/test")
    @ApiOperation("获取所有水泥信息")
    public List<Cement> test() {
        return (List)cementService.getAllCement().getData();
    }
}
