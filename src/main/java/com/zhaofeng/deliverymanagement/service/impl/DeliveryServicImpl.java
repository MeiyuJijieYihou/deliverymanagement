package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.pojo.DeliveryPojo;
import com.zhaofeng.deliverymanagement.repository.DeliveryMapper;
import com.zhaofeng.deliverymanagement.service.DeliveryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Service
public class DeliveryServicImpl implements DeliveryService {

    @Resource
    private DeliveryMapper deliveryMapper;

    @Override
    public JsonResult getDeliveryByUserId(Integer userId) {
        List<DeliveryPojo> deliveryList = deliveryMapper.selectDeliveryDetailByUserId(userId);
        if (deliveryList == null || deliveryList.isEmpty()) {
            return new JsonResult("参数或数据库错误");
        }
        return new JsonResult(deliveryList);
    }
}
