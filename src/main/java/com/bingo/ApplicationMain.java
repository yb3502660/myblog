package com.bingo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author:yaobin
 * @date:2020/4/22,15:05
 */

@SpringBootApplication
@MapperScan("com.bingo.mapper**")
public class ApplicationMain extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationMain.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
