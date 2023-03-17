package com.skypro.mockito;

import com.skypro.mockito.dao.UserDao;
import com.skypro.mockito.dao.UserDaoImpl;
import com.skypro.mockito.model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    void findAllUsersTest() {
        assertNotNull(userDao);
        assertFalse(userDao.findAllUsers().isEmpty());
        assertEquals(5, userDao.findAllUsers().size());
    }

    @Test
    void whenUserExistReturnedUser() {
        assertEquals(userDao.getUserByName("Name1"), userDao.findAllUsers().get(0));
    }

    @Test
    void whenUserDoesNotExistReturnedNull() {
        assertNull(userDao.getUserByName("Name7"));
    }
}
