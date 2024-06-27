package com.example.helloworld;

import org.springframework.boot .SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication：标注这个类是springboot的应用
@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
//        应用启动
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
