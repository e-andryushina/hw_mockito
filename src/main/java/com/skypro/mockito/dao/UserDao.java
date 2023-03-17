package com.skypro.mockito.dao;

import com.skypro.mockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);


    List<User> findAllUsers();
}

