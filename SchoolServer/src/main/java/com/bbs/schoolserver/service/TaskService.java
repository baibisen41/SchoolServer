package com.bbs.schoolserver.service;

import com.bbs.schoolserver.dao.ITaskDao;
import com.bbs.schoolserver.model.Task;
import com.bbs.schoolserver.model.Task_Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 大森 on 2017/9/4.
 */
@Service
public class TaskService implements ITaskService {

    @Autowired
    private ITaskDao taskDao;

    @Override
    public List<Task_Teacher> getAllTask() {
        return taskDao.getAllTask();
    }

    @Override
    public Task readTask(int id) {
        return taskDao.readTask(id);
    }

    @Override
    public boolean writeTask(Task task) {
        //如果返回1 表示写入成功
        if (taskDao.writeTask(task) == 1) {
            return true;
        }
        return false;
    }
}
