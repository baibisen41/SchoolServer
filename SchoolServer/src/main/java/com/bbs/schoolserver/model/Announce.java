package com.bbs.schoolserver.model;

/**
 * Created by 大森 on 2017/9/2.
 */
public class Announce {
    private int announceid;
    private int announcetime;
    private String announcecontent;

    public int getAnnounceid() {
        return announceid;
    }

    public void setAnnounceid(int announceid) {
        this.announceid = announceid;
    }

    public int getAnnouncetime() {
        return announcetime;
    }

    public void setAnnouncetime(int announcetime) {
        this.announcetime = announcetime;
    }

    public String getAnnouncecontent() {
        return announcecontent;
    }

    public void setAnnouncecontent(String announcecontent) {
        this.announcecontent = announcecontent;
    }
}
