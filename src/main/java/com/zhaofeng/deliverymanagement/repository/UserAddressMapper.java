package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.entity.UserAddressKey;

import java.util.List;

public interface UserAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int deleteByPrimaryKey(UserAddressKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int insert(UserAddressKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int insertSelective(UserAddressKey record);



    /**
     * 根据用户id查找地址
     * @param
     * @return
     */
    List<String> selectAllByUserId(Integer userId);
}