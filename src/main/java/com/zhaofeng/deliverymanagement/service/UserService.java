package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.User;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

public interface UserService {

    JsonResult getAllNormalUser();

    JsonResult getAllCustomer();

    JsonResult getCustomerByUserId(Integer userId);

    JsonResult getAllEmployee();

    JsonResult getEmployeeByUserId(Integer userId);

    @Transactional
    JsonResult addNormalUser(User user);

    @Transactional
    JsonResult addCustomer(User user);

    @Transactional
    JsonResult addEmployee(User user);

    @NonNull
    JsonResult updatePassword(@NonNull String oldPassword, @NonNull String newPassword, @NonNull Integer userId);
}
