package com.bbs.schoolserver.service;

import com.bbs.schoolserver.model.Task;
import com.bbs.schoolserver.model.Task_Teacher;

import java.util.List;
import java.util.Map;

/**
 * Created by 大森 on 2017/9/4.
 */
public interface ITaskService {

    //获取全部学生任务信息
    public List<Task_Teacher> getAllTask();

    //读取某个同学任务信息
    public Task readTask(int id);

    //下发任务信息
    public boolean writeTask(Task task);
}
