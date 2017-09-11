package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/2.
 */
public class Reply {

    private String replyid;
    private int replyuserid;
    private String replyusername;
    private int replytime;
    private String replycontent;

    public String getReplyid() {
        return replyid;
    }

    public void setReplyid(String replyid) {
        this.replyid = replyid;
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

    public int getReplytime() {
        return replytime;
    }

    public void setReplytime(int replytime) {
        this.replytime = replytime;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }
}
