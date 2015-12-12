package com.rosenberg.shaul.ex3recyclerview;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Shaul on 12/12/15.
 */
public class MockDAO implements IDataAccess {
    private List<String> descriptionList;

    private static MockDAO instance;
    private static final String TAG = "MockDAO";

    private MockDAO() {
        descriptionList = new ArrayList<String>();
        descriptionList.add("Task #1");
        descriptionList.add("Task #2");
        descriptionList.add("Task #3");
        descriptionList.add("Task #4");
        descriptionList.add("Task #5");
    }

    /*
     * Singleton
     */
    public static MockDAO getInstance()
    {
        if(instance ==  null)
            instance = new MockDAO();
        return instance;
    }

    public List<TaskItem> GetTask() {
        return GenerateRandomTask();
    }

    private List<TaskItem> GenerateRandomTask() {
        List<TaskItem> taskList = new ArrayList<TaskItem>();

        //Log.v(TAG, (descriptionList.size().toString()));
        for (int i = 0; i < descriptionList.size(); i++) {
            TaskItem item = new TaskItem(descriptionList.get(i));
            taskList.add(item);
        }
        return taskList;
    }

    @Override
    public void addTask(TaskItem new_task) {
        descriptionList.add(new_task.getDescription());
    }
}