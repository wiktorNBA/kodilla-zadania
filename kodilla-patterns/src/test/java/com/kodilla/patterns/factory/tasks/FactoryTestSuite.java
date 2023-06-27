package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.HashMap;
import java.util.Map;

public class FactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task task = factory.makeTask(TaskFactory.SHOPPING_TASK);
        task.executeTask();
        boolean isExecuted = task.isTaskExecuted();

        //Then
        Assertions.assertEquals("Shopping task", task.getTaskName());
        Assertions.assertTrue(isExecuted);
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task task = factory.makeTask(TaskFactory.PAINTING_TASK);
        task.executeTask();
        boolean isExecuted = task.isTaskExecuted();

        //Then
        Assertions.assertEquals("Painting task", task.getTaskName());
        Assertions.assertTrue(isExecuted);
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task task = factory.makeTask(TaskFactory.DRIVING_TASK);
        task.executeTask();
        boolean isExecuted = task.isTaskExecuted();

        //Then
        Assertions.assertEquals("Driving task", task.getTaskName());
        Assertions.assertTrue(isExecuted);
    }

    @Test
    void testFactoryPutTaskInMap() {
        //Given
        TaskFactory factory = new TaskFactory();
        Map<Task, Boolean> tasks = new HashMap<>();

        //When
        Task task1 = factory.makeTask(TaskFactory.DRIVING_TASK);
        tasks = factory.putTaskInMap(task1);

        Task task2 = factory.makeTask(TaskFactory.PAINTING_TASK);
        tasks = factory.putTaskInMap(task2);

        //Then
        Assertions.assertEquals("Driving task", task1.getTaskName());
        Assertions.assertEquals("Painting task", task2.getTaskName());
        Assertions.assertTrue(tasks.containsKey(task1));
        Assertions.assertTrue(tasks.containsKey(task2));
        Assertions.assertTrue(tasks.get(task1));
        Assertions.assertTrue(tasks.get(task2));
    }
}
