package com.bbs.schoolserver.service;

import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.ForumDetail;
import com.bbs.schoolserver.model.Reply;

import java.util.List;
import java.util.Map;

/**
 * Created by 大森 on 2017/9/10.
 */
public interface IForumService {

    public List<Forum> getAllForum();

    public List<ForumDetail> showForumDetail(String forumid);

    public Map<String, Object> sendForumMessage(Forum forum);

    public Map<String, Object> sendReplyMessage(Reply reply);
}
