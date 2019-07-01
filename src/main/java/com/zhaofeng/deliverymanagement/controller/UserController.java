package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.dto.CustomerDTO;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.model.params.CustomerParam;
import com.zhaofeng.deliverymanagement.model.params.EmployeeParam;
import com.zhaofeng.deliverymanagement.model.params.NormalUserParam;
import com.zhaofeng.deliverymanagement.model.params.PasswordParam;
import com.zhaofeng.deliverymanagement.model.params.search.CustomerSearchParam;
import com.zhaofeng.deliverymanagement.model.params.search.EmployeeSearchParam;
import com.zhaofeng.deliverymanagement.pojo.EmployeePojo;
import com.zhaofeng.deliverymanagement.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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
@Api(description = "用户相关接口文档")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/customer/{userId}")
    @ApiOperation("根据用户id获取客户")
    public List<CustomerDTO> getCustomerByUserId(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
        return userService.getCustomerByUserId(userId);
    }

    @GetMapping("/customer/like/{userId}/{realname}")
    @ApiOperation("根据用户名模糊搜索")
    public List<CustomerDTO> getCustomerByRealnameLike(@ApiParam("用户id") @PathVariable("userId") Integer userId,
                                                       @ApiParam("真实姓名") @PathVariable("realname") String realname) {
        return userService.getCustomerByRealnameLike(userId, realname);
    }

    @PostMapping("/customer/search")
    @ApiOperation("根据搜索参数获取客户")
    public List<CustomerDTO> getCustomerBySearchParam(@ApiParam("客户搜索参数")CustomerSearchParam customerSearchParam) {
        return userService.getCustomerBySearchParam(customerSearchParam);
    }


    @GetMapping("/employee/{userId}")
    @ApiOperation("根据用户id获取员工")
    public List<EmployeePojo> getEmployeeByUserId(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
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

    @PostMapping("/employee/search")
    @ApiOperation("根据搜索参数获取员工")
    public List<EmployeePojo> getEmployeeBySearchParam(@ApiParam("员工搜索参数") EmployeeSearchParam employeeSearchParam) {
        return userService.getEmployeeBySearchParam(employeeSearchParam);
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

    @DeleteMapping("/delete/{userId}")
    @ApiOperation("删除普通用户、客户、员工")
    public JsonResult delete(@ApiParam("用户id") @PathVariable("userId") Integer userId) {
        return userService.deleteByUserId(userId);
    }

    @PostMapping("/update/{id}")
    @ApiOperation("修改客户信息")
    public JsonResult updateCustomer(@ApiParam("用户id") @PathVariable("id") Integer id, CustomerParam customerParam) {
        User user = customerParam.convertTo();
        user.setId(id);
        return userService.update(user);
    }
}
