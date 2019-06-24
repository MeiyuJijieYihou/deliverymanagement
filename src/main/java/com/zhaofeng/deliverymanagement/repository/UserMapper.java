package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.entity.User;
import com.zhaofeng.deliverymanagement.pojo.UserPojo;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 15:36:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 15:36:21 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 15:36:21 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 15:36:21 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 15:36:21 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 15:36:21 CST 2019
     */
    int updateByPrimaryKey(User record);


    /**
     * 获取所有普通用户
     *
     * @param
     * @return 
     */
    List<UserPojo> selectAllNormalUser();
    
    /**
     * 获取所有客户
     *
     * @param
     * @return 
     */
    List<UserPojo> selectAllCustomer();

    /**
     * 获取所有员工
     *
     * @param
     * @return
     */
    List<UserPojo> selectAllEmployee();


}