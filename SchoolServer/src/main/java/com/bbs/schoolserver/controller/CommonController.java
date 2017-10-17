package com.bbs.schoolserver.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 大森 on 2017/10/17.
 */

@Controller
@RequestMapping("/common")
public class CommonController {

    private static final Logger logger = org.apache.log4j.Logger.getLogger(ForumController.class);

    @RequestMapping("/redirectUrlHandler.do")
    @ResponseBody
    public Map<String, Object> redirectUrlHandler(@RequestParam String msg) {
        Map<String, Object> map = new HashMap<>();
        logger.info("侧边栏点击的是:" + msg);
        int num = Integer.parseInt(msg);
        String url = "";
        switch (num) {
            case 1:
                url = "showUserInformation.do";
                break;
            case 2:
                url = "showForumList.do";
                break;
            case 3:
                url = "showTaskMessage.do";
                break;
            case 4:
                url = "";
                break;
            case 5:
                url = "";
                break;
            case 6:
                url = "";
                break;
            case 7:
                url = "";
                break;
            default:
                break;
        }
        map.put("url", url);
        return map;
    }

}
