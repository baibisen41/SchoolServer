package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/2.
 */
public class Forum {

    private String forumid;
    private int forumuserid;
    private String forumusername;
    private long forumtime;
    private String forumcontent;

    public String getForumid() {
        return forumid;
    }

    public void setForumid(String forumid) {
        this.forumid = forumid;
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

    public String getForumcontent() {
        return forumcontent;
    }

    public void setForumcontent(String forumcontent) {
        this.forumcontent = forumcontent;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + forumid.hashCode();
        result = 37 * result + (int) forumtime;
        result = 37 * result + forumcontent.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Forum)) {
            return false;
        }
        Forum forum = (Forum) obj;
        return this.forumid.equals(forum.forumid);
    }
}
