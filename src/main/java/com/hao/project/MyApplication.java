package com.hao.project;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caishihao9
 */
@SpringBootApplication
@MapperScan("com.hao.project.mapper")
@Slf4j
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
        log.info("项目启动成功");
    }

}
