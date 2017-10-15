package com.bbs.schoolserver.controller;

import com.bbs.schoolserver.common.BaseConstant;
import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.ForumDetail;
import com.bbs.schoolserver.model.Reply;
import com.bbs.schoolserver.service.IForumService;
import com.bbs.schoolserver.utils.DateTimeUtil;
import com.bbs.schoolserver.utils.ForumNumberUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 大森 on 2017/9/10.
 */
@Controller
@RequestMapping("/forum")
public class ForumController {

    private static final Logger logger = Logger.getLogger(ForumController.class);


    @Autowired
    private IForumService forumService;

    //问题列表
    @RequestMapping("/showForumList.do")
    public ModelAndView showForumList() {
        ModelAndView modelAndView = new ModelAndView();
        Forum forum = new Forum();
        List<Forum> forumList = forumService.getAllForum();
//        modelAndView.addObject("forum", forum);
        modelAndView.addObject("forumlist", forumList);
        modelAndView.setViewName("forum_list");
        return modelAndView;
    }

    //帖子中转
    @RequestMapping(value = "/redirectForumDetail.do", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> redirectForumDetail(@RequestParam String forum_detail_id) {
        logger.info("中转帖子id:" + forum_detail_id);
        Map<String, Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(forum_detail_id)) {
            map.put("msg", "showForumDetail.do");
            logger.info("中转帖子id不为空！");
        }
        return map;
    }

    //帖子详情
    @RequestMapping("/showForumDetail.do")
    public ModelAndView showForumDetail(@RequestParam String forum_detail_id) {
        ModelAndView modelAndView = new ModelAndView();
        ForumDetail forumDetail = new ForumDetail();
        System.out.println("帖子id为：" + forum_detail_id);
        List<ForumDetail> forumDetailList;
        if (!StringUtils.isEmpty(forum_detail_id)) {
            forumDetailList = forumService.showForumDetail(forum_detail_id);
            System.out.println("帖子数量为：" + forumDetailList.size());
            System.out.println("帖子内容为：" + forumDetailList.get(0).getForumcontent());

            String userName = forumDetailList.get(0).getForumusername();
            long forumTime = forumDetailList.get(0).getForumtime();
            logger.info(forumTime);
            String forumContent = forumDetailList.get(0).getForumcontent();
            logger.info(forumContent);
            modelAndView.addObject("userName", userName);
            modelAndView.addObject("forumTime", forumTime);
            modelAndView.addObject("forumContent", forumContent);
            modelAndView.addObject("forumDetailList", forumDetailList);
        }
        modelAndView.setViewName("forum_detail");
        return modelAndView;
    }


    @RequestMapping(value = "/forwardForumMessage.do", method = RequestMethod.POST)
    public ModelAndView forwardForumMessage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("send_forum_page");
        return modelAndView;
    }

    @RequestMapping(value = "/sendForumMessage.do", method = RequestMethod.POST)
    public ModelAndView sendForumMessage(@RequestParam String forumContent, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        Forum forum = new Forum();
        String userid = session.getAttribute("userid").toString();
        System.out.println(forumContent);
        //待完善，重新封装
        if (!StringUtils.isEmpty(forumContent)) {

            forum.setForumcontent(forumContent);
            forum.setForumid(ForumNumberUtil.getForumNumberHandler(BaseConstant.FORUM_FLAG));
            forum.setForumtime(DateTimeUtil.toDateHandler());
            System.out.println(DateTimeUtil.toDateHandler());
            forum.setForumuserid(Integer.parseInt(userid));
            forum.setForumusername("baibisen");

            Map<String, Object> getResult = forumService.sendForumMessage(forum);
            int resultCode = Integer.parseInt(getResult.get("resultCode").toString());
            System.out.println("发帖返回码" + String.valueOf(resultCode));
            if (resultCode == 500) {
                String errorMessage = getResult.get("resultMessage").toString();
                System.out.println(errorMessage);
            }
        }
        modelAndView.setViewName("redirect:/forum/showForumList.do");
        return modelAndView;
    }

    @RequestMapping(value = "/sendReplyMessage.do", method = RequestMethod.POST)
    public ModelAndView sendReplyMessage(@RequestParam String replyContent, @RequestParam String replyforumid, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        Reply reply = new Reply();
        System.out.println(replyContent);
        String strUserId = session.getAttribute("userid").toString();
        System.out.println(strUserId);
        System.out.println(replyforumid);

        if (!StringUtils.isEmpty(replyContent) && !StringUtils.isEmpty(replyforumid)) {
            reply.setReplyid(ForumNumberUtil.getForumNumberHandler(BaseConstant.REPLY_FLAG));
            reply.setReplyforumid(replyforumid);
            reply.setReplycontent(replyContent);
            reply.setReplyuserid(Integer.parseInt(strUserId));
            reply.setReplytime(DateTimeUtil.toDateHandler());
            reply.setReplyusername("lihangjiong");

            Map<String, Object> getResult = forumService.sendReplyMessage(reply);
            int resultCode = Integer.parseInt(getResult.get("resultCode").toString());
            System.out.println("回帖返回码" + String.valueOf(resultCode));
            if (resultCode == 500) {
                String errorMessage = getResult.get("resultMessage").toString();
                System.out.println(errorMessage);
            }
            modelAndView.addObject("forum_detail_id", replyforumid);
        }
        modelAndView.setViewName("redirect:/forum/showForumDetail.do");
        return modelAndView;
    }

}
