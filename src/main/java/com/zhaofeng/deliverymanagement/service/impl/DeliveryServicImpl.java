package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.model.entity.Delivery;
import com.zhaofeng.deliverymanagement.model.entity.DeliveryLoader;
import com.zhaofeng.deliverymanagement.model.params.search.DeliverySearchParam;
import com.zhaofeng.deliverymanagement.pojo.SimpleDeliveryPojo;
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
    public List<SimpleDeliveryPojo> getDeliveryByUserId(Integer userId) {
        return deliveryMapper.selectDeliveryByUserId(userId);

    }

    @Override
    public JsonResult addDelivery(Delivery delivery, Set<Integer> orderIds, Set<Integer> loaderIds) {
        deliveryMapper.insertSelective(delivery);
        // 添加项目后获得生成的主键
        final Integer deliveryId = delivery.getId();
        orderIds.forEach(orderId -> {
            ordersMapper.updateDeliveryIdByOrderId(orderId, deliveryId);
        });

        final DeliveryLoader item = new DeliveryLoader();
        loaderIds.forEach(loaderId -> {
            item.setDeliveryId(deliveryId);
            item.setLoaderId(loaderId);
            deliveryLoaderMapper.insert(item);
        });
        return new JsonResult();
    }

    @Override
    public List<SimpleDeliveryPojo> getDeliveryBySearchParam(DeliverySearchParam d) {
        return deliveryMapper.selectDeliveryBySearchParam(d.getUserId(), d.getLicensePlate(), d.getRealname(), d.getFromDate(), d.getToDate());
    }
}
