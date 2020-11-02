package com.chen.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "fruit")
@PropertySource("classpath:application.yml")
public class FruitConfig {
    private String durian;//榴莲
    private String banana;
    private String mango;

    public String getDurian() {
        return durian;
    }

    public void setDurian(String durian) {
        this.durian = durian;
    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    public String getMango() {
        return mango;
    }

    public void setMango(String mango) {
        this.mango = mango;
    }
}
