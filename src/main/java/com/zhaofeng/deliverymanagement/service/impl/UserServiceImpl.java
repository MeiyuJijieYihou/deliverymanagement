package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.common.RtCode;
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
        List<UserPojo> userList = userMapper.selectAllCustomer();
        if (userList == null || userList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(userList);
    }

    @Override
    public JsonResult getAllEmployee() {
        List<UserPojo> userList = userMapper.selectAllEmployee();
        if (userList == null || userList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(userList);
    }
}
