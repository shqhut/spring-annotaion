package com.shq.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String insertSql = "INSERT INTO user(name)VALUES (?)";
        String userName = UUID.randomUUID().toString().substring(0,5);
        jdbcTemplate.update(insertSql,userName);
    }

}
