package com.bbs.schoolserver.dao;

import com.bbs.schoolserver.model.Task;
import com.bbs.schoolserver.model.Task_Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 大森 on 2017/9/4.
 */
@Repository
public interface ITaskDao {

    public List<Task_Teacher> getAllTask();

    public Task readTask(int id);

    public int writeTask(Task task);

}
