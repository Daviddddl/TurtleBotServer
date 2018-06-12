package com.turtlebot.operation.service.user;

import com.turtlebot.operation.dataobject.User;
import com.turtlebot.operation.dataobject.Users;

import java.util.List;

public interface UserService {

    boolean addUser(Integer id);
    User getUser(Integer id);
    boolean deleteUser(Integer id);
    List<User> getUserList();

    boolean registUser(Users users);

}
