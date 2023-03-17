package com.skypro.mockito;
import com.skypro.mockito.dao.UserDao;
import com.skypro.mockito.dao.UserDaoImpl;
import com.skypro.mockito.model.User;
import com.skypro.mockito.service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserDao userDaoMock;

    @InjectMocks
    UserServiceImpl userService;
    User user1 = new User("Name1");
    User user2 = new User("Name2");
    User user3 = new User("Name3");
    User user4 = new User("Name4");
    User user5 = new User("Name5");
    User user6 = new User("Name6");

    List<User> userList;

    void createUser(){
        userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
    }

    @Test
    void whenUserExistReturnedTrue() {
        createUser();
        when(userDaoMock.findAllUsers()).thenReturn(userList);
        assertTrue(userService.checkUserExist(user1));
    }

    @Test
    void whenUserNotExistReturnedTFalse() {
        createUser();
        when(userDaoMock.findAllUsers()).thenReturn(userList);
        assertFalse(userService.checkUserExist(user6));
    }
}

