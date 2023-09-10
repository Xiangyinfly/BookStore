package com.bookstore.book.service;

import com.bookstore.book.pojo.User;

public interface UserService {
    User login(String uname,String pwd);
}
