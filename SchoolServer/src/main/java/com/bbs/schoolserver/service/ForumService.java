package com.bbs.schoolserver.service;

import com.bbs.schoolserver.dao.IForumDao;
import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.ForumDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 大森 on 2017/9/10.
 */
@Service
public class ForumService implements IForumService {

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
}
