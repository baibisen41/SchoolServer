package com.bbs.schoolserver.dao;

import com.bbs.schoolserver.model.UserManager;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 大森 on 2017/9/20.
 */
@Repository
public interface IUserManagerDao {

    public List<UserManager> getAllUserInformation(int userid);

    public int updatePassword(int userid);
}
