package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.pojo.OrdersPojo;
import io.swagger.models.auth.In;

import java.util.Date;
import java.util.List;

public interface OrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    int insert(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    int insertSelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    Orders selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Tue Jun 25 00:59:49 CST 2019
     */
    int updateByPrimaryKey(Orders record);



    /**
     * 根据用户id获取订单
     *
     * @param
     * @return 
     */
    List<OrdersPojo> selectOrdersByUserId(Integer userId);


    /**
     * 根据用户id获取所有完成的订单
     *
     * @param
     * @return
     */
    List<OrdersPojo> selectUncompletedOrdersByUserId(Integer userId);

    /**
     * 根据用户id和客户id获取订单
     *
     * @param
     * @return 
     */
    List<OrdersPojo> selectOrdersByUserIdAndCustomerId(Integer userId, Integer customerId);
    
    /**
     * 设置订单所属发货记录
     *
     * @param
     * @return 
     */
    Integer updateDeliveryIdByOrderId(Integer id, Integer deliveryId);
    
    
    /**
     * 根据搜索参数获取订单
     *
     * @param
     * @return 
     */
    List<OrdersPojo> selectBySearchParam(Integer userId, Integer scope, String realname, String addressName, Date fromDate, Date toDate);
}