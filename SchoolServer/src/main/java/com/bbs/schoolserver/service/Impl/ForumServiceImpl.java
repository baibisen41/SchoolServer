package com.bbs.schoolserver.service.Impl;

import com.bbs.schoolserver.common.BaseConstant;
import com.bbs.schoolserver.dao.IForumDao;
import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.ForumDetail;
import com.bbs.schoolserver.model.Reply;
import com.bbs.schoolserver.service.IForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 大森 on 2017/9/10.
 */
@Service
public class ForumServiceImpl implements IForumService {

    @Autowired
    IForumDao forumDao;

    @Override
    public List<Forum> getAllForum() {
        return forumDao.getAllForum();
    }

    @Override
    public List<ForumDetail> showForumDetail(String forumid) {
        return forumDao.getForumDetail(forumid);
    }

    @Override
    public Map<String, Object> sendForumMessage(Forum forum) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            forumDao.sendForumMessage(forum);
            resultMap.put("resultCode", BaseConstant.SUCCESS_CODE);
        } catch (Exception e) {
            resultMap.put("resultCode", BaseConstant.ERROR_CODE);
            resultMap.put("resultMessage", "操作失败，请重试");
        }
        return resultMap;
    }

    @Override
    public Map<String, Object> sendReplyMessage(Reply reply) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            forumDao.sendReplyMessage(reply);
            resultMap.put("resultCode", BaseConstant.SUCCESS_CODE);
        } catch (Exception e) {
            resultMap.put("resultCode", BaseConstant.ERROR_CODE);
            resultMap.put("resultMessage", "操作失败，请重试");
        }
        return resultMap;
    }
}
