package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.model.dto.user.BaseUserSimpleDTO;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author zhaofeng
 * @date 2019/6/27
 */
@Alias("EmployeePojo")
@Data
public class EmployeePojo extends BaseUserSimpleDTO {
    private String jobName;
}
