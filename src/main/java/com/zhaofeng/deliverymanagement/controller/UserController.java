package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllNormalUser", method = RequestMethod.GET)
    public JsonResult getAllNormalUser() {
        return userService.getAllNormalUser();
    }

    @RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET)
    public JsonResult getAllCustomer() {
        return userService.getAllCustomer();
    }

    @RequestMapping(value = "/getCustomerByUserId", method = RequestMethod.POST)
    public JsonResult getCustomerByUserId(Integer userId) {
        return userService.getCustomerByUserId(userId);
    }

    @RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)
    public JsonResult getAllEmployee() {
        return userService.getAllEmployee();
    }

}
