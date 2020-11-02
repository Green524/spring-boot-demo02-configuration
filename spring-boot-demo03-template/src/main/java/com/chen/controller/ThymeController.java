package com.chen.controller;

import com.chen.bean.Fruit;
import com.sun.deploy.config.JfxRuntime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import java.util.Date;

@Controller
public class ThymeController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("now", new Date().toString());

        model.addAttribute("name", "Thymeleaf");

        model.addAttribute("name1", "<span style='color:red'>thymeleaf</span>");

        Fruit fruit = new Fruit();
        fruit.setBanana("香蕉");
        fruit.setApple("苹果");
        model.addAttribute("fruit", fruit);

//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setCharacterEncoding("UTF-8");
//        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
//        thymeleafViewResolver.setCharacterEncoding("UTF-8");
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "/thymeleaf/welcome";
    }
}
