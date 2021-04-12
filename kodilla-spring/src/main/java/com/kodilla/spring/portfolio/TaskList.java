package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(List<String> tasks) {
        tasks = new ArrayList<>();
        this.tasks = tasks;
    }

    public void addTask(String task){
        tasks.add(task);
    }

    public String getTask(int taskIndex){
        return tasks.get(taskIndex);
    }
}
