package com.chen.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration -->声明这是一个配置文件类，并且创建一个对象
 * @ConfigurationProperties -->声明这是一个配置文件类，并且说明前缀
 * @PropertySourc -->指定一个配置文件路径
 * 多个配置文件采用互补的模式，并且会有优先级
 * 优先级：resources根路径 < resoures/config < 模块同级根目录下 < 模块/config
 * //并且还能在idea在设置加载配置文件的路径，什么路径下都可以
 * java jar方式：--spring.config.location=D:/Application.properties
 * JVM方式：-Dspring.config.location=D:/Application.properties
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:application.yml")
public class VegetableConfig {
    private String potato;
    private String greenpepper;
    private String eggplant;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getGreenpepper() {
        return greenpepper;
    }

    public void setGreenpepper(String greenpepper) {
        this.greenpepper = greenpepper;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }
}
