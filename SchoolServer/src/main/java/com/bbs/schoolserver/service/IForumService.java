package com.bbs.schoolserver.service;

import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.ForumDetail;

import java.util.List;

/**
 * Created by 大森 on 2017/9/10.
 */
public interface IForumService {

    public List<Forum> getAllForum();

    public List<ForumDetail> showForumDetail(String forumid);
}
