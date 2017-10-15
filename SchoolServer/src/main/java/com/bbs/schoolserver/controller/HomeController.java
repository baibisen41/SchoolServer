package com.bbs.schoolserver.controller;

import com.bbs.schoolserver.common.BaseConstant;
import com.bbs.schoolserver.utils.ForumNumberUtil;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 大森 on 2017/8/24.
 */
@Controller
@RequestMapping("/mvc")
public class HomeController {

    private static final Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping(value = "/home.do", method = RequestMethod.GET)
    public String showPage() {
        return "home";
    }

    @RequestMapping(value = "/checkLogin.do", method = RequestMethod.POST)
    public String checkLogin(HttpSession session, HttpServletRequest request) {
        logger.info(System.currentTimeMillis());
        String id = request.getParameter("id");
        String pwd = request.getParameter("password");
        int flag = BaseConstant.STUDENT_STATUS;
        if (id.equals("2013082401") && pwd.equals("123")) {
            session.setAttribute("userid", id);
            session.setAttribute("userflag", flag);
            logger.info(System.currentTimeMillis());
            return "selectPage";
        }
        return "fail";
    }

}
