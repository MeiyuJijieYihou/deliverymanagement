package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.dto.CustomerDTO;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.pojo.EmployeePojo;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

public interface UserService {

    JsonResult getAllNormalUser();

    List<CustomerDTO> getAllCustomer();

    JsonResult getCustomerByUserId(Integer userId);

    JsonResult getAllEmployee();

    List<EmployeePojo> getEmployeeByUserId(Integer userId);

    List<EmployeePojo> getDriverByUserId(Integer userId);

    List<EmployeePojo> getLoaderByUserId(Integer userId);

    @Transactional
    JsonResult addNormalUser(User user);

    @Transactional
    JsonResult addCustomer(User user);

    @Transactional
    JsonResult addEmployee(User user);

    @NonNull
    JsonResult updatePassword(@NonNull String oldPassword, @NonNull String newPassword, @NonNull Integer userId);
}
