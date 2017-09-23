package com.bbs.schoolserver.service.Impl;

import com.bbs.schoolserver.dao.IUserManagerDao;
import com.bbs.schoolserver.model.Forum;
import com.bbs.schoolserver.model.Reply;
import com.bbs.schoolserver.model.Task;
import com.bbs.schoolserver.model.UserManager;
import com.bbs.schoolserver.service.IUserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by 大森 on 2017/9/20.
 */
@Service
public class UserManagerServiceImpl implements IUserManagerService {

    @Autowired
    private IUserManagerDao userManagerDao;

    @Override
    public Map<String, Object> getAllUserInformation(int id) {
        long startHandler = System.currentTimeMillis();

        Map<String, Object> getUserInformation = new HashMap<String, Object>();
        List<UserManager> userManagerList = userManagerDao.getAllUserInformation(id);
        Set<Forum> forumSet = new HashSet<Forum>();
        Set<Reply> replySet = new HashSet<Reply>();
        Set<Task> taskSet = new HashSet<Task>();

        Forum forum = null;
        Reply reply = null;
        Task task = null;

        int i = 0;
        for (; i < userManagerList.size(); i++) {
            forum = new Forum();
            forum.setForumid(userManagerList.get(i).getForumid());
            forum.setForumtime(userManagerList.get(i).getForumtime());
            forum.setForumcontent(userManagerList.get(i).getForumcontent());

            reply = new Reply();
            reply.setReplyid(userManagerList.get(i).getReplyid());
            reply.setReplytime(userManagerList.get(i).getReplytime());
            reply.setReplycontent(userManagerList.get(i).getReplycontent());

            task = new Task();
            task.setTasktime(userManagerList.get(i).getTasktime());
            task.setTaskcontent(userManagerList.get(i).getTaskcontent());

            forumSet.add(forum);
            replySet.add(reply);
            taskSet.add(task);
        }

        getUserInformation.put("forumList", forumSet);
        getUserInformation.put("replyList", replySet);
        getUserInformation.put("taskList", taskSet);

        System.out.println("帖子数量为：" + String.valueOf(forumSet.size()));
        System.out.println("回复数量为：" + String.valueOf(replySet.size()));
        System.out.println("任务数量为：" + String.valueOf(taskSet.size()));

        long endHandler = System.currentTimeMillis();

        System.out.println("读取全部信息花费时间：" + String.valueOf(endHandler - startHandler) + "毫秒");

        return getUserInformation;
    }


}
