package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/2.
 */
public class Sign {

    private int userid;
    private int signtime;
    private int signcount;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getSigntime() {
        return signtime;
    }

    public void setSigntime(int signtime) {
        this.signtime = signtime;
    }

    public int getSigncount() {
        return signcount;
    }

    public void setSigncount(int signcount) {
        this.signcount = signcount;
    }
}
