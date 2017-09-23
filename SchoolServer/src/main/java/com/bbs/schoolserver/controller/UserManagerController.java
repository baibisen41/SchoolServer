package com.bbs.schoolserver.controller;

import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.Reply;
import com.bbs.schoolserver.model.Task;
import com.bbs.schoolserver.model.UserManager;
import com.bbs.schoolserver.service.IUserManagerService;
import com.bbs.schoolserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by 大森 on 2017/9/20.
 */
@Controller
@RequestMapping("/usermanager")
public class UserManagerController {

    @Autowired
    private IUserManagerService userManagerService;

    @RequestMapping("/showUserInformation.do")
    public ModelAndView showUserInformation(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        UserManager userManager = new UserManager();
        int userId = Integer.parseInt(session.getAttribute("userid").toString());
        Map<String, Object> userManagerList = userManagerService.getAllUserInformation(userId);


        List<Forum> forumList = new ArrayList<Forum>();
        List<Reply> replyList = new ArrayList<Reply>();
        List<Task> taskList = new ArrayList<Task>();

        Set<Forum> forumSet = (Set<Forum>) userManagerList.get("forumList");
        Set<Reply> replySet = (Set<Reply>) userManagerList.get("replyList");
        Set<Task> taskSet = (Set<Task>) userManagerList.get("taskList");

        for (Forum forum : forumSet) {
            forumList.add(forum);
        }

        for (Reply reply : replySet) {
            replyList.add(reply);
        }

        for (Task task : taskSet) {
            taskList.add(task);
        }

        Forum forum = new Forum();
        Reply reply = new Reply();
        Task task = new Task();

        modelAndView.addObject("forum", forum);
        modelAndView.addObject("forumList", forumList);

        modelAndView.addObject("reply", reply);
        modelAndView.addObject("replyList", replyList);

        modelAndView.addObject("task", task);
        modelAndView.addObject("taskList", taskList);

        modelAndView.setViewName("show_user_information");
        return modelAndView;
    }
}
