package com.kodilla.patterns.factory.tasks;

public class TasksFactory {

    public static final String SHOPPING_TASK = "ShoppingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String DIVING_TASK = "DivingTask";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING_TASK -> new ShoppingTask("Get Alcohol", "Brandy", 1);
            case PAINTING_TASK -> new PaintingTask("Pain Room", "Black", "wall");
            case DIVING_TASK -> new DivingTask("Diving?", "In water", "nothing");
            default -> null;
        };

    }

}
