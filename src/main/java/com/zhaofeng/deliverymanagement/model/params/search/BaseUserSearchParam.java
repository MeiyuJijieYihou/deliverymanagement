package com.zhaofeng.deliverymanagement.model.params.search;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author zhaofeng
 * @date 2019/7/1
 */

@Data
public class BaseUserSearchParam {

    @NotNull(message = "用户id不能为空")
    private Integer userId;

    private String realname;

    private Date fromDate;

    private Date toDate;
}
