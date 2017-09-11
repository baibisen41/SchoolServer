package com.bbs.schoolserver.controller;

import com.bbs.schoolserver.common.BaseConstant;
import com.bbs.schoolserver.utils.ForumNumberUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 大森 on 2017/8/24.
 */
@Controller
@RequestMapping("/mvc")
public class HomeController {

    ForumNumberUtil forumNumberUtil = new ForumNumberUtil();

    @RequestMapping(value = "/home.do", method = RequestMethod.GET)
    public String showPage() {
        return "home";
    }

    @RequestMapping(value = "/checkLogin.do", method = RequestMethod.POST)
    public String checkLogin(HttpSession session, HttpServletRequest request) {
        String id = request.getParameter("id");
        String pwd = request.getParameter("password");
        int flag = BaseConstant.TEACHER_STATUS;
        if (id.equals("2013082401") && pwd.equals("123")) {
    //        forumNumberUtil.getForumNumberHandler(flag);
            session.setAttribute("userid", id);
            session.setAttribute("userflag", flag);
            //    return "redirect:/task/showTaskMessage.do";
            return "selectPage";
        }
        return "fail";
    }

}
