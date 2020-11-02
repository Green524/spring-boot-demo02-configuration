package com.chen.bean;


import lombok.Data;

@Data
public class Fruit {

    //每一次请求生成bean对象，执行完即销毁
    private String durian;//榴莲
    private String banana;
    private String mango;

    public Fruit() {
        System.out.println("Fruit构造方式执行了");
    }

}
