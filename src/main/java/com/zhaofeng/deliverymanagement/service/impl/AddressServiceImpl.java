package com.zhaofeng.deliverymanagement.service.impl;

import com.zhaofeng.deliverymanagement.common.JsonResult;
import com.zhaofeng.deliverymanagement.common.RtCode;
import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.repository.AddressMapper;
import com.zhaofeng.deliverymanagement.service.AddressService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

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
    public List<Address> getAllAddressByCustomerId(Integer customerId) {
        Example example = Example.builder(Address.class).where(Sqls.custom().andEqualTo("customerId", customerId)).build();
        return addressMapper.selectByExample(example);
    }

    @Override
    public JsonResult addAddress(Address address) {
        addressMapper.insertSelective(address);
        return new JsonResult();
    }
}
