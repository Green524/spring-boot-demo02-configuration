package com.chen.dao;

import com.chen.bean.Team;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeamDao {
    private static List<Team> list = new ArrayList<>();
    static{
        list.add(new Team("梁智铭","上单"));
        list.add(new Team("李敦九","打野"));
        list.add(new Team("伍龙飞","ad"));
        list.add(new Team("贺湖涛","辅助"));
        list.add(new Team("我","中路王者卡特"));
        list.add(new Team("周乐进","替补打野"));
        list.add(new Team("theshy","替补上路"));
    }
    public List<Team> getList(){
        return list;
    }
    public Team getTeam(String name){
        for (Team team : list) {
            if(team.getName().equals(name)){
                return team;
            }
        }
        return new Team("","");
    }
    public void update(Team team){
        Team team1 = this.getTeam(team.getName());
        list.remove(team1);
        list.add(team);
    }
    public void delete(String name){
        list.remove(this.getTeam(name));
    }
    public void insert(Team team){
        list.add(team);
    }
}
