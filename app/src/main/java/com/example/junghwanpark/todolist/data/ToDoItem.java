package com.example.junghwanpark.todolist.data;

/**
 * Created by JungHwanPark on 7/18/2017.
 */

public class ToDoItem {
    private String description;
    private String dueDate;

    public ToDoItem(String description, String dueDate) {
        this.description = description;
        this.dueDate = dueDate;
    }
    // This is a getter and setter of the date and the descriptions
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
