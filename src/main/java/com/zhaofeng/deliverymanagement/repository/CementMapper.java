package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Cement;

import java.util.List;

public interface CementMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Cement record);

    int insertSelective(Cement record);

    Cement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cement record);

    int updateByPrimaryKey(Cement record);

    /**
     * 获取所有水泥信息
     *
     * @param
     * @return
     */
    List<Cement> selectAll();
}