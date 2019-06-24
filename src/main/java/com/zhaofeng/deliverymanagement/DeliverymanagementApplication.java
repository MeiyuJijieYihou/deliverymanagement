package com.zhaofeng.deliverymanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhaofeng.deliverymanagement.repository")
public class DeliverymanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliverymanagementApplication.class, args);
    }

}
