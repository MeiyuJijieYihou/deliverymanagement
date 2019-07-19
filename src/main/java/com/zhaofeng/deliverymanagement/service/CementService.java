package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Cement;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

public interface CementService {
    List<Cement> getAllCement();
}
