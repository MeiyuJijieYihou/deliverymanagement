package com.zhaofeng.deliverymanagement.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhaofeng
 * @date 2019/6/27
 */
@Alias("SimpleDeliveryPojo")
@Data
public class SimpleDeliveryPojo {
    private Integer id;

    private String licensePlate;

    private String driverName;

    private Date deliveryTime;

    /**
     * 返回类型为字符串的日期
     *
     * @param
     * @return
     */
    public String getDeliveryTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(deliveryTime);
    }
}
