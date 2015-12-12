package com.rosenberg.shaul.ex3recyclerview;

import java.util.List;
/**
 * Created by Shaul on 12/12/15.
 */

public interface IDataAccess {
    List<TaskItem> GetTask();
    void addTask(TaskItem friend);
}