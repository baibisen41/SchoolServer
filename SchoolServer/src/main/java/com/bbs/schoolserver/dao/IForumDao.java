package com.bbs.schoolserver.dao;

import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.ForumDetail;
import com.bbs.schoolserver.model.Reply;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 大森 on 2017/9/10.
 */
@Repository
public interface IForumDao {

    public List<Forum> getAllForum();

    public List<ForumDetail> getForumDetail(String forumid);

    public int sendForumMessage(Forum forum);

    public int sendReplyMessage(Reply reply);

}
