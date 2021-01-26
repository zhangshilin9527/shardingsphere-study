package com.xiaolinzi.shardingsphere.study;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xiaolinzi.shardingsphere.study.mapper")
@SpringBootApplication
public class ShardingsphereStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingsphereStudyApplication.class, args);
    }

}
