package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import org.springframework.transaction.annotation.Transactional;
import springfox.documentation.spring.web.json.Json;

import java.util.Set;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

public interface DeliveryService {
    JsonResult getDeliveryByUserId(Integer userId);

    @Transactional
    JsonResult addDelivery(Delivery delivery, Set<Integer> orderIds, Set<Integer> loaderIds);
}
