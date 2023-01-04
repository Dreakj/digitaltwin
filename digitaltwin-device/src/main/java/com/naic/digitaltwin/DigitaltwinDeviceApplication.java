package com.naic.digitaltwin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.naic.digitaltwin.mapper")
@EnableFeignClients(basePackages = "com.naic.digitaltwin")
public class DigitaltwinDeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitaltwinDeviceApplication.class, args);
    }

}
