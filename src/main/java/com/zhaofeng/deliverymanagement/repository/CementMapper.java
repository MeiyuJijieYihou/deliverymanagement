package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Cement;

public interface CementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cement
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cement
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int insert(Cement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cement
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int insertSelective(Cement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cement
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    Cement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cement
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int updateByPrimaryKeySelective(Cement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cement
     *
     * @mbg.generated Mon Jun 24 14:36:42 CST 2019
     */
    int updateByPrimaryKey(Cement record);
}