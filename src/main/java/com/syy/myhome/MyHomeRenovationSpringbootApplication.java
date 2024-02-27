package com.syy.myhome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@MapperScan("com.syy.myhome.mapper")
public class MyHomeRenovationSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHomeRenovationSpringbootApplication.class, args);
    }

}
