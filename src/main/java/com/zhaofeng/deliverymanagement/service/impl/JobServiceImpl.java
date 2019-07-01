package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.model.entity.Job;
import com.zhaofeng.deliverymanagement.repository.JobMapper;
import com.zhaofeng.deliverymanagement.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/28
 */

@Service
public class JobServiceImpl implements JobService {
    @Resource
    private JobMapper jobMapper;

    @Override
    public List<Job> getAllJob() {
        return jobMapper.selectAll();
    }
}
