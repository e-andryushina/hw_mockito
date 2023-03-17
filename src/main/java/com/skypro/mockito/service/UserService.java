package com.skypro.mockito.service;

import com.skypro.mockito.dao.UserDaoImpl;
import com.skypro.mockito.model.User;

public interface UserService {
    boolean checkUserExist (User user1);
}
