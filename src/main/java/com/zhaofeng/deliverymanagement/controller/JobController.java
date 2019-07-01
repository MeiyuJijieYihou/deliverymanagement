package com.zhaofeng.deliverymanagement.controller;

import com.zhaofeng.deliverymanagement.model.entity.Job;
import com.zhaofeng.deliverymanagement.service.JobService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/28
 */
@RestController
@RequestMapping("/api/job")
@Api(description = "职位相关接口文档")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/")
    @ApiOperation("获取所有职位")
    public List<Job> getAllJob() {
        return jobService.getAllJob();
    }
}
