package com.bookstore.book.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.bookstore.book.dao.UserDao;
import com.bookstore.book.pojo.User;

public class UserDaoImpl extends BaseDAO<User> implements UserDao {

    @Override
    public User getUser(String uname, String pwd) {
        return load("select * from t_user where uname like ? and pwd like ?",uname,pwd);
    }
}
