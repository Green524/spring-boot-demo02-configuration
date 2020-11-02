package com.chen.service;

import com.chen.bean.Team;

import java.util.List;

public interface TeamService {

    List<Team> selectAll();

    Team selectOne(String name);

    void update(Team team);

    void delete(String name);

    void insert(Team team);
}
