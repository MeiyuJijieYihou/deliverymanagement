package com.zhaofeng.deliverymanagement.model.dto;

import com.zhaofeng.deliverymanagement.model.dto.user.BaseUserSimpleDTO;
import lombok.Data;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Data
public class EmployeeDTO extends BaseUserSimpleDTO {
    private Integer jobId;
}