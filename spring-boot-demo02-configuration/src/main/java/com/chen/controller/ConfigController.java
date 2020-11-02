package com.chen.controller;

import com.chen.bean.Food;
import com.chen.bean.Fruit;
import com.chen.bean.Vegetables;
import com.chen.config.FoodConfig;
import com.chen.config.FruitConfig;
import com.chen.config.VegetableConfig;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController-->为@Controller 和 @RespnseBody注解的组合
 * 直接返回json格式的数据
 */
@RestController
public class ConfigController {
    //@Value注解 一般配合Application.properties文件使用
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;
//    @Value("${food.saces}")
//    private String[] saces;

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @Autowired
    private FoodConfig foodConfig;

    @Autowired
    private VegetableConfig vegetableConfig;

    @Autowired
    private FruitConfig fruitConfig;

    @RequestMapping(value = "/json")
    public Food json() {
//        System.out.println(rice+"--"+meat+"--"+saces.toString());
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        food.setSaces(foodConfig.getSaces());
        return food;
    }

    @RequestMapping(value = "/vegetables")
    public Vegetables vegetables() {
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetableConfig.getPotato());
        vegetables.setEggplant(vegetableConfig.getEggplant());
        vegetables.setGreenpepper(vegetableConfig.getGreenpepper());
        return vegetables;
    }

    @RequestMapping("/fruit")
    public Fruit fruit() {
        Fruit fruit = new Fruit();
        fruit.setBanana(fruitConfig.getBanana());
        fruit.setDurian(fruitConfig.getDurian());
        fruit.setMango(fruitConfig.getMango());
        return fruit;
    }

    @RequestMapping("jasypt")
    public String jasypt() {
        //生成加密账号和密码
//        BasicTextEncryptor encryptor = new BasicTextEncryptor();
//        encryptor.setPassword("123456!@#");//设置加盐
        //解密
//        String username = encryptor.decrypt("DuggqXEIvKfGdVONGDA42A==");
//        String password = encryptor.decrypt("U4NZ4Q+w3X8+7GrdnwgFXw==");
        //加密 生成的多个密文的解密结果都一样
//        String username = encryptor.encrypt("root");
//        String password = encryptor.encrypt("root123");

        return username + "\t" + password;
    }
}
