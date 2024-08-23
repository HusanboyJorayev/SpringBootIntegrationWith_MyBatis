package org.example.springbootintegrationmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "org.example.springbootintegrationmybatis.batis")
public class SpringBootIntegrationMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntegrationMyBatisApplication.class, args);
    }

}
