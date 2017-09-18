package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/10.
 */
public class ForumDetail {

    private String forumid;
    private String forumcontent;
    private int forumuserid;
    private String forumusername;
    private long forumtime;
    private String replyid;
    private String replycontent;
    private int replyuserid;
    private String replyusername;
    private long replytime;

    public String getForumid() {
        return forumid;
    }

    public void setForumid(String forumid) {
        this.forumid = forumid;
    }

    public String getForumcontent() {
        return forumcontent;
    }

    public void setForumcontent(String forumcontent) {
        this.forumcontent = forumcontent;
    }

    public int getForumuserid() {
        return forumuserid;
    }

    public void setForumuserid(int forumuserid) {
        this.forumuserid = forumuserid;
    }

    public String getForumusername() {
        return forumusername;
    }

    public void setForumusername(String forumusername) {
        this.forumusername = forumusername;
    }

    public long getForumtime() {
        return forumtime;
    }

    public void setForumtime(long forumtime) {
        this.forumtime = forumtime;
    }

    public String getReplyid() {
        return replyid;
    }

    public void setReplyid(String replyid) {
        this.replyid = replyid;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    public int getReplyuserid() {
        return replyuserid;
    }

    public void setReplyuserid(int replyuserid) {
        this.replyuserid = replyuserid;
    }

    public String getReplyusername() {
        return replyusername;
    }

    public void setReplyusername(String replyusername) {
        this.replyusername = replyusername;
    }

    public long getReplytime() {
        return replytime;
    }

    public void setReplytime(long replytime) {
        this.replytime = replytime;
    }
}
