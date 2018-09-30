package com.example.springbootmybatis.service;

import com.example.springbootmybatis.dao.UserDao;
import com.example.springbootmybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserDao userDao;

    public List<User> getUsers(){
        List<User> users = userDao.getUsers();
        return  users;
    }
}
