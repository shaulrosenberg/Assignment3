package com.rosenberg.shaul.ex3recyclerview;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaul on 12/12/15.
 */
public class TasksController implements ITasksController {

    private List<String> descriptionList;
    private IDataAccess dao;

    TasksController() {
        descriptionList = new ArrayList<String>();
        descriptionList.add("Task #a");
        descriptionList.add("Task #b");
        descriptionList.add("Task #c");
        descriptionList.add("Task #d");
        descriptionList.add("Task #e");
        dao = MockDAO.getInstance();
    }

    public List<TaskItem> GetTasks() {
        return dao.GetTask();
    }

    public void addTask(TaskItem new_task){
        try {
            //add the friend to the data base and use the returned friend and add it ti the local cache.
            //the friend that returned from the DAO contain the id of the entity.
            dao.addTask(new_task);
            //if(retTask == null) return;
            //update what ever it will be.



        } catch (Exception e) {
            Log.e("MainController", e.getMessage());
        }
    }

}