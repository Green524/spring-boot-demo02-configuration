package com.chen.service.impl;

import com.chen.bean.Team;
import com.chen.dao.TeamDao;
import com.chen.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamDao teamDao;
    @Override
    public List<Team> selectAll() {
        return teamDao.getList();
    }

    @Override
    public Team selectOne(String name) {
        return teamDao.getTeam(name);
    }

    @Override
    public void update(Team team) {
        teamDao.update(team);
    }

    @Override
    public void delete(String name) {
        teamDao.delete(name);
    }

    @Override
    public void insert(Team team) {
        teamDao.insert(team);
    }

}
