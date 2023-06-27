package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public final class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";
    private final Map<Task, Boolean> tasks = new HashMap<>();

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING_TASK -> {
                return new ShoppingTask("Shopping task", "Bread", 2);
            }
            case PAINTING_TASK -> {
                return new PaintingTask("Painting task", "Blue", "Sky");
            }
            case DRIVING_TASK -> {
                return new DrivingTask("Driving task", "Warsaw Airport", "Van");
            }
            default -> {
                return null;
            }
        }
    }

    public Map<Task, Boolean> putTaskInMap(Task task) {
        task.executeTask();
        Boolean isExecuted = task.isTaskExecuted();
        tasks.put(task, isExecuted);
        return tasks;
    }
}
