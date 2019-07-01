package com.zhaofeng.deliverymanagement.service;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import com.zhaofeng.deliverymanagement.model.params.search.DeliverySearchParam;
import com.zhaofeng.deliverymanagement.pojo.SimpleDeliveryPojo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

public interface DeliveryService {
    List<SimpleDeliveryPojo> getDeliveryByUserId(Integer userId);

    @Transactional
    JsonResult addDelivery(Delivery delivery, Set<Integer> orderIds, Set<Integer> loaderIds);

    List<SimpleDeliveryPojo> getDeliveryBySearchParam(DeliverySearchParam deliverySearchParam);
}
