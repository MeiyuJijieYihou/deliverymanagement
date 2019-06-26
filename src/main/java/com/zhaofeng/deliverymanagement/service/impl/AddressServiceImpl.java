package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.common.RtCode;
import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.repository.AddressMapper;
import com.zhaofeng.deliverymanagement.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressMapper addressMapper;

    @Override
    public JsonResult getAllAddressByCustomerId(Integer customerId) {
        List<Address> addressList = addressMapper.selectByCustomerId(customerId);
        if (addressList == null || addressList.isEmpty()) {
            return new JsonResult(RtCode.DB_ERROR, "数据库访问异常");
        }
        return new JsonResult(addressList);
    }
}
