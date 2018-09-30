package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getUsers();
}
