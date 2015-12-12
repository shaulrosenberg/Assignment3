package com.rosenberg.shaul.ex3recyclerview;

import java.util.List;

/**
 * Created by Shaul on 12/12/15.
 */
public interface ITasksController {
    List<TaskItem> GetTasks();
    void addTask(TaskItem task);
}