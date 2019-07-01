package com.zhaofeng.deliverymanagement.model.dto.user;

import com.zhaofeng.deliverymanagement.model.dto.user.BaseUserMinimalDTO;
import lombok.Data;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Data
public class BaseUserSimpleDTO extends BaseUserMinimalDTO {
    private String phone;

    private String remark;
}
