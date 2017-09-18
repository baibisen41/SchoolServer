package com.bbs.schoolserver.service.Impl;

import com.bbs.schoolserver.dao.IUserDao;
import com.bbs.schoolserver.model.User;
import com.bbs.schoolserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 大森 on 2017/8/26.
 */

@Service
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    @Autowired
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    @Override
    public User getUser(String id) {
        return getUserDao().getUserList(id);
    }
}
