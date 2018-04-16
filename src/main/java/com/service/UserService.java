package com.service;

import com.dao.UserDAO;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;
    public User selectByName(String name){
        return userDAO.selectByName(name);
    }
    public User getUser(int id) {
        return userDAO.selectById(id);
    }
}
