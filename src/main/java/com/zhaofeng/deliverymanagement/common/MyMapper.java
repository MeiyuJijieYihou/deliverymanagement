package com.zhaofeng.deliverymanagement.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Description:
 *
 * @author zhaofeng
 * @version 1.0
 * @date: 2019/8/20 21:55
 * @since JDK 1.8
 */
public interface MyMapper<T> extends MySqlMapper<T>, Mapper<T> {
}
