package com.chen.controller;

import com.chen.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    //final 修饰的属性必须初始化
    private static final String template = "Hello, %s!";
    //原子变量
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println(counter.getAndIncrement());//0
        System.out.println(counter.getAndIncrement());//1
        System.out.println(counter.intValue());//2
        System.out.println(counter.intValue());//2
        //counter.incrementAndGet(); 每一次调用方法自动+1
        System.out.println(counter.incrementAndGet());//3
        System.out.println(counter.incrementAndGet());//4
        final String b;
        b = "";
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
