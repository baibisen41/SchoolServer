package com.bbs.schoolserver.utils;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by 大森 on 2017/9/10.
 */
public class ForumNumberUtil {

    //帖子编号格式 ---> 0/1 + 20170910 + 10000
    public static String getForumNumberHandler(int userFlag) {

        //获取用户类型
        String strUserFlag = String.valueOf(userFlag);
        //获取系统时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String strDate = dateFormat.format(new Date());
        //获取帖子尾部编号
        String strNumber = String.valueOf(new Random().nextInt(99999) % (99999 - 10000 + 1) + 10000);
        //拼接帖子编号
        String strForumNumber = strUserFlag + strDate + strNumber;
        System.out.println(strForumNumber);

        return strForumNumber;
    }
}
