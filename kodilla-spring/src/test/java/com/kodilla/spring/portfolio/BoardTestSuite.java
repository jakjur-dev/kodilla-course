package com.kodilla.spring.portfolio;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {


    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("task to do");
        board.getInProgressList().addTask("task in progress");
        board.getDoneList().addTask("done task");

        //Then
        System.out.println(board.getToDoList().getTask(0));
        System.out.println(board.getInProgressList().getTask(0));
        System.out.println(board.getDoneList().getTask(0));
    }
}
