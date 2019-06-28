package com.zhaofeng.deliverymanagement.model.dto.user;

import com.zhaofeng.deliverymanagement.model.base.OutputConverter;
import com.zhaofeng.deliverymanagement.model.entity.User;
import lombok.Data;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */
@Data
public class BaseUserMinimalDTO implements OutputConverter<BaseUserMinimalDTO, User> {
    private Integer id;

    private String realname;
}
