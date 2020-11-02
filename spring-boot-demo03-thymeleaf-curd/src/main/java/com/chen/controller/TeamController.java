package com.chen.controller;

import com.chen.bean.Team;
import com.chen.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeamController {

    @Autowired
    private TeamService teamService;


    //显示列表
    @RequestMapping("/team/list")
    public String list(Model model){
        List<Team> teamList = teamService.selectAll();
        model.addAttribute("teamList",teamList);
        return "list";
    }
    @RequestMapping("/team/updatePage")
    public String updatePage(Model model , String name){
        Team team = teamService.selectOne(name);
        model.addAttribute("team",team);
        return "update";
    }

    //编辑
    @RequestMapping("/team/update")
    public String update(Model model,Team team){
        teamService.update(team);
        model.addAttribute("teamList",teamService.selectAll());
        return "redirect:list";
    }
    //删除
    @RequestMapping("/team/delete")
    public String delete(Model model,String name){
        teamService.delete(name);
        model.addAttribute("teamList",teamService.selectAll());

        return "redirect:list";
    }
//
    //增加
    @RequestMapping("/team/add")
    public String add(Model model,Team team){
        teamService.insert(team);
        model.addAttribute("teamList",teamService.selectAll());
        return "redirect:list";
    }


    @RequestMapping("/temp/addPage")
    public String addPage(){
        return "add";
    }


}
