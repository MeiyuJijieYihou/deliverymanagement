package com.zhaofeng.deliverymanagement.pojo;

import com.zhaofeng.deliverymanagement.model.dto.user.BaseUserMinimalDTO;
import com.zhaofeng.deliverymanagement.model.entity.Orders;
import com.zhaofeng.deliverymanagement.model.entity.Truck;
import com.zhaofeng.deliverymanagement.model.entity.User;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author zhaofeng
 * @date 2019/6/24
 */

@Alias("DeliveryPojo")
@Data
public class DeliveryPojo {
    private Integer id;

    private String licensePlate;

    private String driverName;

    private List<OrdersPojo> orderList;

    private List<BaseUserMinimalDTO> loaderList;

    private Date deliveryTime;

    private Date createdTime;


    public String getDeliveryTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(deliveryTime);
    }

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
