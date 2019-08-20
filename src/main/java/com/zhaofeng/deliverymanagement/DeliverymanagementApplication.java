package com.zhaofeng.deliverymanagement;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.zhaofeng.deliverymanagement.repository")
@EnableSwagger2
public class DeliverymanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliverymanagementApplication.class, args);
    }

}