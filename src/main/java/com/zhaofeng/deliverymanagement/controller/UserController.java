package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.model.params.CustomerParam;
import com.zhaofeng.deliverymanagement.model.params.EmployeeParam;
import com.zhaofeng.deliverymanagement.model.params.NormalUserParam;
import com.zhaofeng.deliverymanagement.model.params.PasswordParam;
import com.zhaofeng.deliverymanagement.pojo.EmployeePojo;
import com.zhaofeng.deliverymanagement.service.UserService;
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
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/customer/{userId}")
    @ApiOperation("根据用户id获取客户")
    public JsonResult getCustomerByUserId(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
        return userService.getCustomerByUserId(userId);
    }


    @GetMapping("/employee")
    @ApiOperation("根据用户id获取员工")
    public List<EmployeePojo> getEmployeeByUserId(@ApiParam("用户id") Integer userId) {
        return userService.getEmployeeByUserId(userId);
    }

    @GetMapping("/driver/{userId}")
    @ApiOperation("根据用户id获取司机")
    public List<EmployeePojo> getDriverByUserId(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
        return userService.getDriverByUserId(userId);
    }

    @GetMapping("/loader/{userId}")
    @ApiOperation("根据用户id获取装卸工")
    public List<EmployeePojo> getLoaderByUserId(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
        return userService.getLoaderByUserId(userId);
    }


    @PostMapping("/addNormalUser")
    @ApiOperation("添加普通用户")
    public JsonResult addNormalUser(@ApiParam("普通用户信息") @Valid NormalUserParam normalUserParam) {
        User user = normalUserParam.convertTo();
        return userService.addNormalUser(user);
    }

    @PostMapping("/addCustomer")
    @ApiOperation("添加客户")
    public JsonResult addCustomer(@ApiParam("客户信息") @Valid CustomerParam customerParam) {
        User user = customerParam.convertTo();
        return userService.addCustomer(user);
    }

    @PostMapping("/addEmployee")
    @ApiOperation("添加员工")
    public JsonResult addEmployee(@ApiParam("员工信息") @Valid EmployeeParam employeeParam) {
        User user = employeeParam.convertTo();
        return userService.addEmployee(user);
    }

    @PutMapping("profiles/password")
    public JsonResult updatePassword(@ApiParam("新旧密码") @RequestBody @Valid PasswordParam passwordParam,
                                     @ApiParam("用户id") Integer userId) {
        return userService.updatePassword(passwordParam.getOldPassword(), passwordParam.getNewPassword(), userId);
    }
}
