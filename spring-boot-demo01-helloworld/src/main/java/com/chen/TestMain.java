package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 告诉主程序入口类, 并且生命是springboot项目
 */
@SpringBootApplication
public class TestMain {
    public static void main(String[] args) {
        SpringApplication.run(TestMain.class, args);
    }
}
