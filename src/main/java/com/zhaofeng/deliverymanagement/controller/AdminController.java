package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.dto.CustomerDTO;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

//@CrossOrigin
@RestController
@RequestMapping("/api/admin")
@Api(description = "管理员相关接口文档")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    @ApiOperation("获取所有普通用户")
    public List<User> listAllNormalUser() {
        System.out.println("进入");
        return (List) userService.getAllNormalUser().getData();
    }

    @GetMapping("/test")
    public String test() {
        return "12342534534";
    }


    @GetMapping("/customer")
    @ApiOperation("获取所有客户")
    public List<CustomerDTO> listAllCustomer() {
        return userService.getAllCustomer();
    }

    @GetMapping("/employee")
    @ApiOperation("获取所有员工")
    public JsonResult getAllEmployee() {
        return userService.getAllEmployee();
    }
}
