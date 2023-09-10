package com.bookstore.book.controller;

import com.bookstore.book.pojo.User;
import com.bookstore.book.service.UserService;

public class UserController {
    private UserService userService;
    public String login(String uname,String pwd) {
        User user = userService.login(uname, pwd);
        System.out.println(user);

        return "index";
    }
}
