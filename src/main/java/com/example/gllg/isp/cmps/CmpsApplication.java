package com.example.gllg.isp.cmps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.example.gllg.isp.cmps.mapper"})
public class CmpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmpsApplication.class, args);
    }

}
