package com.skypro.mockito.dao;

import com.skypro.mockito.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private final List<User> users;

    public UserDaoImpl() {
        this.users = new ArrayList<>();
        this.users.add(new User("Name1"));
        this.users.add(new User("Name2"));
        this.users.add(new User("Name3"));
        this.users.add(new User("Name4"));
        this.users.add(new User("Name5"));
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public User getUserByName(String name) {
        List<User> users = findAllUsers().stream()
                .filter(u -> u.getName().equals(name))
                .toList();
        if (users.size()>0){
            return users.get(0);
        }
        else return null;
    }
}