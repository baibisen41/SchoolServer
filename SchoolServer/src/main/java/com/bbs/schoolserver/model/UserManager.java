package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/20.
 */
public class UserManager {

    private int userid;
    private String username;
    private String forumid;
    private long forumtime;
    private String forumcontent;
    private String replyid;
    private long replytime;
    private String replycontent;
    private long tasktime;
    private String taskcontent;
    private int taskstatus;
    private int signcount;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getForumid() {
        return forumid;
    }

    public void setForumid(String forumid) {
        this.forumid = forumid;
    }

    public long getForumtime() {
        return forumtime;
    }

    public void setForumtime(long forumtime) {
        this.forumtime = forumtime;
    }

    public String getForumcontent() {
        return forumcontent;
    }

    public void setForumcontent(String forumcontent) {
        this.forumcontent = forumcontent;
    }

    public String getReplyid() {
        return replyid;
    }

    public void setReplyid(String replyid) {
        this.replyid = replyid;
    }

    public long getReplytime() {
        return replytime;
    }

    public void setReplytime(long replytime) {
        this.replytime = replytime;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    public long getTasktime() {
        return tasktime;
    }

    public void setTasktime(long tasktime) {
        this.tasktime = tasktime;
    }

    public String getTaskcontent() {
        return taskcontent;
    }

    public void setTaskcontent(String taskcontent) {
        this.taskcontent = taskcontent;
    }

    public int getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(int taskstatus) {
        this.taskstatus = taskstatus;
    }

    public int getSigncount() {
        return signcount;
    }

    public void setSigncount(int signcount) {
        this.signcount = signcount;
    }
}
