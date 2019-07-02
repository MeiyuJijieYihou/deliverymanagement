package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.dto.CustomerDTO;
import com.zhaofeng.deliverymanagement.model.entity.User;
import com.zhaofeng.deliverymanagement.model.entity.UserExample;
import com.zhaofeng.deliverymanagement.pojo.EmployeePojo;
import com.zhaofeng.deliverymanagement.pojo.SimpleUserPojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 获取所有普通用户
     *
     * @param
     * @return
     */
    List<SimpleUserPojo> selectAllNormalUser();

    /**
     * 获取所有客户
     *
     * @param
     * @return
     */
    List<CustomerDTO> selectAllCustomer();

    /**
     * 根据用户id获取客户
     *
     * @param
     * @return
     */
    List<CustomerDTO> selectCustomerByUserId(Integer userId);

    /**
     * 获取所有员工
     *
     * @param
     * @return
     */
    List<SimpleUserPojo> selectAllEmployee();

    /**
     * 根据用户id获取员工
     *
     * @param
     * @return
     */
    List<EmployeePojo> selectEmployeeByUserId(Integer userId);

    /**
     * 统计真实姓名姓名与指定的姓名相同的普通用户数量
     *
     * @param
     * @return
     */
    Integer countByRealnameUnderNormalUser(String username);

    /**
     * 统计真实姓名姓名与指定的姓名相同的客户数量
     *
     * @param
     * @return
     */
    Integer countByOwnerIdAndRealnameUnderCustomer(Integer ownerId, String realname);


    /**
     * 统计真实姓名姓名与指定的姓名相同的员工数量
     *
     * @param
     * @return
     */
    Integer countByOwnerIdAndRealnameUnderEmployee(Integer ownerId, String realname);

    /**
     * 根据用户id获取司机
     *
     * @param
     * @return
     */
    List<EmployeePojo> selectDriverByUserId(Integer userId);

    /**
     * 根据用户id获取装卸工
     *
     * @param
     * @return
     */
    List<EmployeePojo> selectLoaderByUserId(Integer userId);

    List<CustomerDTO> selectCustomerByRealnameLike(Integer userId, String realname);

    List<CustomerDTO> selectCustomerBySearchParam(Integer ownerId, String realname, String phone);

    List<EmployeePojo> selectEmployeeBySearchParam(Integer ownerId, Integer jobId, String realname, String phone);
}