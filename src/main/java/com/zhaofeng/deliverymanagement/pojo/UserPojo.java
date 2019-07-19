package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.model.entity.Job;
import com.zhaofeng.deliverymanagement.model.entity.Role;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Alias("UserPojo")
@Data
public class UserPojo {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private String phone;

    private Job job;

    private List<Role> roleList;

    private List<Address> addressList;
}
