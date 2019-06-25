package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.common.RtCode;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.pojo.UserPojo;
import com.zhaofeng.deliverymanagement.repository.UserMapper;
import com.zhaofeng.deliverymanagement.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public JsonResult getAllNormalUser() {
        List<UserPojo> userList = userMapper.selectAllNormalUser();
        if (userList == null || userList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(userList);
    }

    @Override
    public JsonResult getAllCustomer() {
        List<UserPojo> customerList = userMapper.selectAllCustomer();
        if (customerList == null || customerList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(customerList);
    }

    @Override
    public JsonResult getCustomerByUserId(Integer userId) {
        List<UserPojo> customerList = userMapper.selectCustomerByUserId(userId);
        if (customerList == null || customerList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(customerList);
    }

    @Override
    public JsonResult getAllEmployee() {
        List<UserPojo> employeeList = userMapper.selectAllEmployee();
        if (employeeList == null || employeeList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(employeeList);
    }

    @Override
    public JsonResult getEmployeeByUserId(Integer userId) {
        List<UserPojo> employeeList = userMapper.selectEmployeeByUserId(userId);
        if (employeeList == null || employeeList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(employeeList);
    }


    @Override
    public JsonResult addNormalUser(User user) {
        // 校验代码...

        userMapper.insertSelective(user);
        return new JsonResult();
    }


    @Override
    public JsonResult addCustomer(User user) {
        // 校验代码...

        userMapper.insertSelective(user);
        return new JsonResult();
    }

    @Override
    public JsonResult addEmployee(User user) {
        // 校验代码...

        userMapper.insertSelective(user);
        return new JsonResult();
    }


}
