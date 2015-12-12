package com.rosenberg.shaul.ex3recyclerview;

/**
 * Created by Shaul on 10/12/15.
 */
public class TaskItem {

    private int itemId;
    private String itemName;
    String description;

    // constructor
    public TaskItem(int itemId, String itemName) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public TaskItem() {
        super();
    }


    public TaskItem(String description) {
        super();
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public long getTaskId() {
        return itemId;
    }

    public String getItemName() { return this.itemName; }

    public void setItemName(String name) { this.itemName = name; }

    public void setTaskId(int taskId) {
        this.itemId = taskId;
    }
}
