package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.model.params.CustomerParam;
import com.zhaofeng.deliverymanagement.model.params.EmployeeParam;
import com.zhaofeng.deliverymanagement.model.params.NormalUserParam;
import com.zhaofeng.deliverymanagement.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    @ApiOperation("获取所有普通用户")
    public JsonResult listAllNormalUser() {
        return userService.getAllNormalUser();
    }

//    @GetMapping("customer")
//    @ApiOperation("获取所有客户")
//    public JsonResult listAllCustomer() {
//        return userService.getAllCustomer();
//    }

    @GetMapping("/customer")
    @ApiOperation("根据用户id获取客户")
    public JsonResult getCustomerByUserId(@RequestParam("userId") Integer userId) {
        return userService.getCustomerByUserId(userId);
    }

//    @GetMapping("employee")
//    @ApiOperation("获取所有员工")
//    public JsonResult getAllEmployee() {
//        return userService.getAllEmployee();
//    }

    @GetMapping("/employee")
    @ApiOperation("根据用户id获取员工")
    public JsonResult getEmployeeByUserId(Integer userId) {
        return userService.getEmployeeByUserId(userId);
    }


    @PostMapping("/addNormalUser")
    @ApiOperation("添加普通用户")
    public JsonResult addNormalUser(@Valid @RequestBody NormalUserParam normalUserParam) {
        User user = normalUserParam.convertTo();
        return userService.addNormalUser(user);
    }

    @PostMapping("/addCustomer")
    @ApiOperation("添加客户")
    public JsonResult addCustomer(@Valid CustomerParam customerParam) {
        User user = customerParam.convertTo();
        return userService.addCustomer(user);
    }

    @PostMapping("/addEmployee")
    @ApiOperation("添加员工")
    public JsonResult addEmployee(@Valid EmployeeParam employeeParam) {
        User user = employeeParam.convertTo();
        return userService.addEmployee(user);
    }

}
