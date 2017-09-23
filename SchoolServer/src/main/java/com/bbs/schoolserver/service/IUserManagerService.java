package com.bbs.schoolserver.service;

import com.bbs.schoolserver.model.UserManager;

import java.util.List;
import java.util.Map;

/**
 * Created by 大森 on 2017/9/20.
 */
public interface IUserManagerService {

    public Map<String, Object> getAllUserInformation(int id);

}
