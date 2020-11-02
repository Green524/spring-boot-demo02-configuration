package com.chen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class TemplateController {

    @RequestMapping("/freemarker")
    public String freemarker(Model model) {
        System.out.println("freemarker");
        //freemarker模板如果找不到.ftl页面需要的变量 会报错
        model.addAttribute("now", new Date().toString());
        return "/freemarker/index";
    }

}
