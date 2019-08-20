package com.zhaofeng.deliverymanagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeliverymanagementApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        Date date = new Date(1519833600L);
        System.out.println(date);
    }

}
