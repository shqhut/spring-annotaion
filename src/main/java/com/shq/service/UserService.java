package com.shq.service;

import com.shq.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void insertUser(){
        userDao.insert();
    }
}
