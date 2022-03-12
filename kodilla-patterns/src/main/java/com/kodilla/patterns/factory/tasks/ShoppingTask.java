package com.kodilla.patterns.factory.tasks;

final class ShoppingTask implements Task{
    private String name;
    boolean isDone = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity){
        this.name = taskName;
        System.out.println(whatToBuy+" times "+quantity);
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
