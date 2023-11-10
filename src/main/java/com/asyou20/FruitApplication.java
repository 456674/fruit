package com.asyou20;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.asyou20.mapper")
public class FruitApplication {

    public static void main(String[] args) {
        //在这里~
        SpringApplication.run(FruitApplication.class, args);
        System.out.println ("Helloworld,pfching");
    }

}
