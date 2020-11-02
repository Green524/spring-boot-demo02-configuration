package com.chen;

import com.chen.config.FoodConfig;
import com.chen.config.FruitConfig;
import com.chen.config.VegetableConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class, VegetableConfig.class, FruitConfig.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


    }
}
