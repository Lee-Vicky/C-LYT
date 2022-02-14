package com.lyt.service;

import com.lyt.dao.UserDao;
import com.lyt.dao.UserDaoImpl;
import com.lyt.dao.UserDaoMySqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void getUser() {
        userDao.getUser();
    }

}
