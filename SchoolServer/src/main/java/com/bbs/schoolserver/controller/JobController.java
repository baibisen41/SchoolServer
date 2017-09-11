package com.bbs.schoolserver.controller;

import com.bbs.schoolserver.model.User;
import com.bbs.schoolserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 大森 on 2017/8/26.
 */

@Controller
@RequestMapping("/job")
public class JobController {


    private IUserService userService;

    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public IUserService getUserService() {
        return userService;
    }

    @RequestMapping(value = "joblist.do", method = RequestMethod.GET)
    public String showJobList(ModelMap modelMap) {
        User user = getUserService().getUser("1");

        modelMap.put("userid", user.getUserid());
        modelMap.put("username", user.getUsername());
        modelMap.put("password", user.getUserpassword());
        return "task_teacher";
    }

}
