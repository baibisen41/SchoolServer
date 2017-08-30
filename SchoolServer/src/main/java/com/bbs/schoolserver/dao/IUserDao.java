package com.bbs.schoolserver.dao;

import com.bbs.schoolserver.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by 大森 on 2017/8/26.
 */
@Repository
public interface IUserDao {

    public User getUserList(String id);
}
