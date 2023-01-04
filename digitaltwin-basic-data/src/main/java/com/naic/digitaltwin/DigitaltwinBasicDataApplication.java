package com.naic.digitaltwin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.naic.digitaltwin.mapper")
public class DigitaltwinBasicDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitaltwinBasicDataApplication.class, args);
    }

}
