package com.bbs.schoolserver.controller;

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

    @RequestMapping(value = "/home.do", method = RequestMethod.GET)
    public String showPage() {
        return "home";
    }

    @RequestMapping(value = "/checkLogin.do", method = RequestMethod.POST)
    public String checkLogin(HttpSession session, HttpServletRequest request) {
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        if (name.equals("bbs") && pwd.equals("123")) {
            session.setAttribute("username", name);
            return "redirect:/job/joblist.do";
        }
        return "fail";
    }

}
