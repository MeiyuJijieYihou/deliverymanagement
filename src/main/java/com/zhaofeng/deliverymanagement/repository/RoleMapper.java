package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Role;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int updateByPrimaryKey(Role record);
}