package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.common.RtCode;
import com.zhaofeng.deliverymanagement.exception.AlreadyExistsException;
import com.zhaofeng.deliverymanagement.exception.BadRequestException;
import com.zhaofeng.deliverymanagement.exception.BaseException;
import com.zhaofeng.deliverymanagement.model.dto.CustomerDTO;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.model.params.search.CustomerSearchParam;
import com.zhaofeng.deliverymanagement.model.params.search.EmployeeSearchParam;
import com.zhaofeng.deliverymanagement.pojo.EmployeePojo;
import com.zhaofeng.deliverymanagement.pojo.SimpleUserPojo;
import com.zhaofeng.deliverymanagement.repository.UserMapper;
import com.zhaofeng.deliverymanagement.service.UserService;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

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
        List userList = userMapper.selectAllNormalUser();
        if (userList == null || userList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(userList);
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return userMapper.selectAllCustomer();
//        if (customerList == null || customerList.isEmpty()) {
//            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
//        }
//        return new JsonResult(customerList);
    }

    /**
     *
     * @description：
     *
     * @params [userId]
     * @return java.util.List<com.zhaofeng.deliverymanagement.model.dto.CustomerDTO>
     * @author zhaofeng
     * @date 2019/7/10 16:54
     */
    @Override
    public List<CustomerDTO> getCustomerByUserId(Integer userId) {
        return userMapper.selectCustomerByUserId(userId);
    }

    @Override
    public JsonResult getAllEmployee() {
        List<SimpleUserPojo> employeeList = userMapper.selectAllEmployee();
        if (employeeList == null || employeeList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(employeeList);
    }

    @Override
    public List<EmployeePojo> getDriverByUserId(Integer userId) {
        return userMapper.selectDriverByUserId(userId);
    }

    @Override
    public List<EmployeePojo> getLoaderByUserId(Integer userId) {
        return userMapper.selectLoaderByUserId(userId);
    }

    @Override
    public List<EmployeePojo> getEmployeeByUserId(Integer userId) {
        return userMapper.selectEmployeeByUserId(userId);
    }


    @Override
    public JsonResult addNormalUser(User user) {
        int count = userMapper.countByRealnameUnderNormalUser(user.getUsername());

        if (count > 0) {
            throw new AlreadyExistsException("该普通用户已存在").setErrorData(user);
        }

        userMapper.insertSelective(user);
        return new JsonResult();
    }


    @Override
    public JsonResult addCustomer(User user) {
        int count = userMapper.countByOwnerIdAndRealnameUnderCustomer(user.getOwnerId(), user.getRealname());

        if (count > 0) {
            throw new AlreadyExistsException("该客户已存在").setErrorData(user);
        }

        userMapper.insertSelective(user);
        return new JsonResult();
    }

    @Override
    public JsonResult addEmployee(User user) {
        int count = userMapper.countByOwnerIdAndRealnameUnderEmployee(user.getOwnerId(), user.getRealname());

        if (count > 0) {
            throw new AlreadyExistsException("该员工已存在").setErrorData(user);
        }

        userMapper.insertSelective(user);
        return new JsonResult();
    }

    @Override
    public JsonResult updatePassword(String oldPassword, String newPassword, Integer userId) {
        Assert.hasText(oldPassword, "Old password must not be blank");
        Assert.hasText(newPassword, "New password must not be blank");
        Assert.notNull(userId, "User id must not be blank");

        if (oldPassword.equals(newPassword)) {
            throw new BadRequestException("新密码和旧密码不能相同");
        }

        // Get the user
        User user = userMapper.selectByPrimaryKey(userId);

        if (!user.getPassword().equals(oldPassword)) {
            throw new BadRequestException("旧密码错误").setErrorData(oldPassword);
        }
        // Check the user old password
//        if (!BCrypt.checkpw(oldPassword, user.getPassword())) {
//            throw new BadRequestException("旧密码错误").setErrorData(oldPassword);
//        }

        // Set new password
        setPassword(user, newPassword);

        // Update this user
//        User updatedUser = update(user);
        userMapper.updateByPrimaryKey(user);

//        // Log it
//        eventPublisher.publishEvent(new LogEvent(this, updatedUser.getId().toString(), LogType.PASSWORD_UPDATED, oldPassword));

//        return updatedUser;
        return new JsonResult(user, "密码修改成功");
    }

    @Override
    public JsonResult deleteByUserId(Integer userId) {
        int count = userMapper.deleteByPrimaryKey(userId);

        return new JsonResult();
    }

    @Override
    public JsonResult update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return new JsonResult();
    }

    @Override
    public List<CustomerDTO> getCustomerByRealnameLike(Integer userId, String realname) {
        return userMapper.selectCustomerByRealnameLike(userId,"%" + realname + "%");
    }

    @Override
    public List<CustomerDTO> getCustomerBySearchParam(CustomerSearchParam c) {
        return userMapper.selectCustomerBySearchParam(c.getOwnerId(), c.getRealname(), c.getPhone());
    }

    @Override
    public List<EmployeePojo> getEmployeeBySearchParam(EmployeeSearchParam e) {
        return userMapper.selectEmployeeBySearchParam(e.getOwnerId(), e.getJobId(), e.getRealname(), e.getPhone());
    }

    public void setPassword(@NonNull User user, @NonNull String plainPassword) {
        Assert.notNull(user, "User must not be null");
        Assert.hasText(plainPassword, "Plain password must not be blank");
        user.setPassword(plainPassword);
//        user.setPassword(BCrypt.hashpw(plainPassword, BCrypt.gensalt()));
    }


}
