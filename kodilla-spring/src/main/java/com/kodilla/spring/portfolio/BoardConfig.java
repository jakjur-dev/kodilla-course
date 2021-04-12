package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        List<String> tasksToDo = new ArrayList<>();
        return new TaskList(tasksToDo);
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        List<String> tasksInProgress = new ArrayList<>();
        return new TaskList(tasksInProgress);
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        List<String> tasksDone = new ArrayList<>();
        return new TaskList(tasksDone);
    }
}