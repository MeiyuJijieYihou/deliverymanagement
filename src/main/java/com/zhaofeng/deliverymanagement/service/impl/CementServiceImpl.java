package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Cement;
import com.zhaofeng.deliverymanagement.repository.CementMapper;
import com.zhaofeng.deliverymanagement.service.CementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Service
public class CementServiceImpl implements CementService {
    @Resource
    private CementMapper cementMapper;

    @Override
    public List<Cement> getAllCement() {
        return cementMapper.selectAll();
    }
}
