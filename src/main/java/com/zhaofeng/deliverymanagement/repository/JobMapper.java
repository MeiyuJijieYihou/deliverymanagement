package com.zhaofeng.deliverymanagement.repository;

import com.zhaofeng.deliverymanagement.model.entity.Job;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface JobMapper extends Mapper<Job> {

    /**
     * 获取所有职位信息
     *
     * @param
     * @return 
     */
    //List<Job> selectAll();
}