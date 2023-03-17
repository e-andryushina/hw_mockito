package com.skypro.mockito.service;

import com.skypro.mockito.dao.UserDao;
import com.skypro.mockito.dao.UserDaoImpl;
import com.skypro.mockito.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.findAllUsers().contains(user);
    }
}
