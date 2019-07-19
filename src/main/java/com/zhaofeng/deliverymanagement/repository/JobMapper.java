package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Job;

import java.util.List;

public interface JobMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

    /**
     * 获取所有职位信息
     *
     * @param
     * @return 
     */
    List<Job> selectAll();
}