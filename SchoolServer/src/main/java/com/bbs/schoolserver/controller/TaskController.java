package com.bbs.schoolserver.controller;

import com.bbs.schoolserver.common.BaseConstant;
import com.bbs.schoolserver.model.Task;
import com.bbs.schoolserver.model.Task_Teacher;
import com.bbs.schoolserver.service.ITaskService;
import com.bbs.schoolserver.utils.DateTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by 大森 on 2017/9/2.
 */
@Controller
@RequestMapping("/task")
public class TaskController {

    private static final int SHOW_STUDENT_PAGE = 0;
    private static final int SHOW_TEACHER_PAGE = 1;

    @Autowired
    private ITaskService taskService;

    //主操作
    @RequestMapping(value = "/showTaskMessage.do", method = RequestMethod.POST)
    public ModelAndView showTaskMessage(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        Task_Teacher task_teacher = new Task_Teacher();
        Task task = new Task();
        int userid = Integer.parseInt(session.getAttribute("userid").toString());
        int userflag = Integer.parseInt(session.getAttribute("userflag").toString());
        if (userflag == BaseConstant.TEACHER_STATUS) {
            List<Task_Teacher> taskList = taskService.getAllTask();
            modelAndView.addObject("taskList", taskList);
            modelAndView.addObject("task", task_teacher);
            modelAndView.setViewName("task_teacher");
        } else if (userflag == BaseConstant.STUDENT_STATUS) {
            task = taskService.readTask(userid);
            modelAndView.addObject("userid", task.getUserid());
            modelAndView.addObject("myTask", task.getTaskcontent());
            modelAndView.setViewName("task_student");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/writeTaskMessage.do", method = RequestMethod.POST)
    public String writeTaskMessage(HttpServletRequest request, HttpSession session) {
        boolean finish = false;
        Task task = new Task();
        int userid = Integer.parseInt(session.getAttribute("userid").toString());
        String taskContent = request.getParameter("writetask");
        System.out.println(taskContent);
        if (!StringUtils.isEmpty(taskContent)) {
            task.setUserid(userid);
            task.setTasktime(DateTimeUtil.toDateHandler());
            System.out.println(DateTimeUtil.toDateHandler());
            task.setTaskcontent(taskContent);
            finish = taskService.writeTask(task);
        }
        if (finish == true) {
            return "success";
        }
        return "fail";
    }


}
