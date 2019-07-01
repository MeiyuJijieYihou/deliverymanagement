package com.zhaofeng.deliverymanagement.model.params;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author zhaofeng
 * @date 2019/7/1
 */
@Data
public class BaseUserSimpleParam extends BaseUserMinimalParam {
    @NotNull(message = "所属用户id不能为空")
    private Integer ownerId;
}
