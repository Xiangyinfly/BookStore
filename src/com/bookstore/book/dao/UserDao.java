package com.bookstore.book.dao;

import com.bookstore.book.pojo.User;

public interface UserDao {
    User getUser(String uname,String pwd);
}
