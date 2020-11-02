package com.chen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ConfigurationProperties 申明这是一个配置文件对应的一个类, 并且表示一个
 */
@Configuration
@ConfigurationProperties(prefix = "food")
@PropertySource("classpath:application.yml")
@Data
public class FoodConfig {


    private String rice;
    private String meat;

    private String[] saces;

}
