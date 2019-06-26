package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping()
    @ApiOperation("获取所有普通用户")
    public JsonResult listAllNormalUser() {
        return userService.getAllNormalUser();
    }


    @GetMapping("/customer")
    @ApiOperation("获取所有客户")
    public JsonResult listAllCustomer() {
        return userService.getAllCustomer();
    }

    @GetMapping("/employee")
    @ApiOperation("获取所有员工")
    public JsonResult getAllEmployee() {
        return userService.getAllEmployee();
    }
}
