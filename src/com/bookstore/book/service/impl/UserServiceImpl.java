package com.bookstore.book.service.impl;

import com.bookstore.book.dao.UserDao;
import com.bookstore.book.pojo.User;
import com.bookstore.book.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public User login(String uname, String pwd) {
        return userDao.getUser(uname,pwd);
    }
}
