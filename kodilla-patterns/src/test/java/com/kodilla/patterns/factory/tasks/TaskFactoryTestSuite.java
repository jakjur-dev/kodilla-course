package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    private static final TaskFactory factory = new TaskFactory();

    @Test
    void testFactoryDriving() {
        //Given
        Task drivingTask = factory.createTask(TaskFactory.DRIVING);
        //When
        drivingTask.executeTask();
        //Then
        assertTrue(drivingTask.isTaskExecuted());
        assertEquals("VAN transport", drivingTask.getTaskName());
    }

    @Test
    void testFactoryPainting() {
        //Given
        Task paintingTask = factory.createTask(TaskFactory.PAINTING);
        //When
        paintingTask.executeTask();
        //Then
        assertTrue(paintingTask.isTaskExecuted());
        assertEquals("Painting red wall", paintingTask.getTaskName());
    }

    @Test
    void testFactoryShopping() {
        //Given
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING);
        //When
        shoppingTask.executeTask();
        //Then
        assertTrue(shoppingTask.isTaskExecuted());
        assertEquals("Buy three apples", shoppingTask.getTaskName());
    }

}
