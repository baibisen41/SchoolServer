package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/2.
 */
public class Task {

    private int userid;
    private long tasktime;
    private String taskcontent;
    private int taskstatus;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (int) tasktime;
        result = 37 * result + taskcontent.hashCode();
        result = 37 * result + taskstatus;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Task)) {
            return false;
        }
        Task task = (Task) obj;
        return this.taskcontent.equals(task.taskcontent);
    }
}
