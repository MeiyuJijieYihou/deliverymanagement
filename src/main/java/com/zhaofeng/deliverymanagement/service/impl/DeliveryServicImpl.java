package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import com.zhaofeng.deliverymanagement.model.entity.DeliveryLoaderKey;
import com.zhaofeng.deliverymanagement.pojo.DeliveryPojo;
import com.zhaofeng.deliverymanagement.repository.DeliveryLoaderMapper;
import com.zhaofeng.deliverymanagement.repository.DeliveryMapper;
import com.zhaofeng.deliverymanagement.repository.OrdersMapper;
import com.zhaofeng.deliverymanagement.service.DeliveryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Service
public class DeliveryServicImpl implements DeliveryService {

    @Resource
    private DeliveryMapper deliveryMapper;

    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private DeliveryLoaderMapper deliveryLoaderMapper;

    @Override
    public JsonResult getDeliveryByUserId(Integer userId) {
        List<DeliveryPojo> deliveryList = deliveryMapper.selectDeliveryDetailByUserId(userId);
        if (deliveryList == null || deliveryList.isEmpty()) {
            return new JsonResult("参数或数据库错误");
        }
        return new JsonResult(deliveryList);
    }

    @Override
    public JsonResult addDelivery(Delivery delivery, Set<Integer> orderIds, Set<Integer> loaderIds) {
        deliveryMapper.insertSelective(delivery);
        // 添加项目后获得生成的主键
        final Integer deliveryId = delivery.getId();
        orderIds.forEach(orderId -> {
            ordersMapper.updateDeliveryIdByOrderId(orderId, deliveryId);
        });

        final DeliveryLoaderKey item = new DeliveryLoaderKey();
        loaderIds.forEach(loaderId -> {
            item.setDeliveryId(deliveryId);
            item.setLoaderId(loaderId);
            deliveryLoaderMapper.insert(item);
        });
        return new JsonResult();
    }
}
