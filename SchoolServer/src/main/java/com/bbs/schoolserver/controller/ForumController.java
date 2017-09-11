package com.bbs.schoolserver.controller;

import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.ForumDetail;
import com.bbs.schoolserver.service.IForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 大森 on 2017/9/10.
 */
@Controller
@RequestMapping("/forum")
public class ForumController {

    @Autowired
    private IForumService forumService;


    @RequestMapping(value = "/showForumList.do", method = RequestMethod.POST)
    public ModelAndView showForumList() {
        ModelAndView modelAndView = new ModelAndView();
        Forum forum = new Forum();
        List<Forum> forumList = forumService.getAllForum();
        modelAndView.addObject("forum", forum);
        modelAndView.addObject("forumlist", forumList);
        modelAndView.setViewName("forum_list");
        return modelAndView;
    }

    @RequestMapping(value = "/showForumDetail.do", method = RequestMethod.POST)
    public ModelAndView showForumDetail(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        ForumDetail forumDetail = new ForumDetail();
        String forumId = request.getParameter("forum_detail_hidden");
        System.out.println("帖子id为：" + forumDetail);
        List<ForumDetail> forumDetailList = forumService.showForumDetail(forumId);
        System.out.println("帖子数量为：" + forumDetailList.size());
        System.out.println("帖子内容为：" + forumDetailList.get(0).getForumcontent());

        modelAndView.addObject("forumDetail", forumDetail);
        modelAndView.addObject("forumDetailList", forumDetailList);
        modelAndView.setViewName("forum_detail");
        return modelAndView;
    }
}
