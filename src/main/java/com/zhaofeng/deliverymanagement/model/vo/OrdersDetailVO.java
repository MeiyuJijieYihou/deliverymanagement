package com.zhaofeng.deliverymanagement.model.vo;

import com.zhaofeng.deliverymanagement.model.entity.Address;
import com.zhaofeng.deliverymanagement.model.entity.Cement;
import com.zhaofeng.deliverymanagement.model.entity.User;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhaofeng
 * @date 2019/6/26
 */

@Data
public class OrdersDetailVO {
    private Integer id;

    private String customerName;

    private String addressName;

    private String cementName;

    private Double unitPrice;

    private Double num;

    private Date createdTime;

    private Integer deliveryId;

    /**
     * 返回类型为字符串的日期
     *
     * @param
     * @return
     */
    public String getCreatedTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(createdTime);
    }
}
