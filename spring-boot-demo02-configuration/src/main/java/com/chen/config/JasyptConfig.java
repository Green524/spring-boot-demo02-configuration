package com.chen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "jasypt")
@PropertySource("classpath:application.yml")
@Data
public class JasyptConfig {
    private String username;
    private String password;
}
