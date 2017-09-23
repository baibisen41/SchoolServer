package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/2.
 */
public class Reply {

    private String replyid;
    private String replyforumid;
    private int replyuserid;
    private String replyusername;
    private long replytime;
    private String replycontent;

    public String getReplyforumid() {
        return replyforumid;
    }

    public void setReplyforumid(String replyforumid) {
        this.replyforumid = replyforumid;
    }

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

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + replyid.hashCode();
        result = 37 * result + (int) replytime;
        result = 37 * result + replycontent.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Reply)) {
            return false;
        }
        Reply reply = (Reply) obj;
        return this.replyid.equals(reply.replyid);
    }
}
