package com.kodilla.patterns.factory.tasks;

final class PaintingTask implements Task{
    String name;
    boolean isDone;

    public PaintingTask(String taskName, String color, String whatToPaint){
        this.name = taskName;
        System.out.println(whatToPaint+" in "+color);
    }

    @Override
    public void executeTask() {
        isDone = true;
    }

    @Override
    public String getTaskName() {
        return this.name;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
