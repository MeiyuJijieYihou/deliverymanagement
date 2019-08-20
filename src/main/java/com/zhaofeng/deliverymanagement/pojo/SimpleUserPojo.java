package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.model.entity.Job;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */
@Alias("SimpleUserPojo")
@Data
public class SimpleUserPojo {
    private Integer id;

    private String username;

    private String realname;

    private String phone;

    private String remark;

}
