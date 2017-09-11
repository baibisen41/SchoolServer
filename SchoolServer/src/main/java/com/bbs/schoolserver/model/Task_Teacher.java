package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/8.
 */
public class Task_Teacher {
    private int userid;
    private String username;
    private int tasktime;
    private String taskcontent;
    private int taskstatus;

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

    public int getTasktime() {
        return tasktime;
    }

    public void setTasktime(int tasktime) {
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
}
