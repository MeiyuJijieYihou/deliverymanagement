package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.entity.UserDeliveryKey;

public interface UserDeliveryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_delivery
     *
     * @mbg.generated Mon Jun 24 21:51:21 CST 2019
     */
    int deleteByPrimaryKey(UserDeliveryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_delivery
     *
     * @mbg.generated Mon Jun 24 21:51:21 CST 2019
     */
    int insert(UserDeliveryKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_delivery
     *
     * @mbg.generated Mon Jun 24 21:51:21 CST 2019
     */
    int insertSelective(UserDeliveryKey record);
}