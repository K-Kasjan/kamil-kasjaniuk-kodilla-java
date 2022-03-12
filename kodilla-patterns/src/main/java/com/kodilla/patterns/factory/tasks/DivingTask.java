package com.kodilla.patterns.factory.tasks;

final class DivingTask implements Task{
    String name;
    boolean isDone;

    public DivingTask(String taskName, String where, String using){
        this.name = taskName;
        System.out.println(where+" using "+using);
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
