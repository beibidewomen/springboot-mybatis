package com.example.springbootmybatis.controller;


import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public List<User> getUser(){
       return userService.getUsers();
    }

    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public User insertUser(User user){
        userService.insertUser(user);
        return user;
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
    public User updateUser(User user){
        System.out.println(user);
        userService.updateUser(user);
        return user;
    }

    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public Integer deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return id;
    }
}
