package com.cf.bsixapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cf.bsixapp.mbg.mapper")
public class BsixappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsixappApplication.class, args);
    }

}
