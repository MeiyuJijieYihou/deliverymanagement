package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.model.entity.Job;
import org.apache.ibatis.type.Alias;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */
@Alias("SimpleUserPojo")
public class SimpleUserPojo {
    private Integer id;

    private String username;

    private String realname;

    private String phone;

}
