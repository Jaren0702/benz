package com.personal.benz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author jarenzhao
 */
@SpringBootApplication(scanBasePackages = ("com.personal.benz"), exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.personal.benz.mapper")
public class BenzApplication {

    public static void main(String[] args) {
        SpringApplication.run(BenzApplication.class, args);
    }

}

