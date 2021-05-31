package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.io.IOException;

/**
 * @program: springBoot
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-28 11:14
 **/

@MapperScan("com.mapper")
@SpringBootApplication

public class StartApp {
    public static void main(String[] args) {

        SpringApplication.run(StartApp.class);
        try {
            Runtime.getRuntime().exec("cmd /c start http://localhost:" + 8080+"/springBoot/login.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
