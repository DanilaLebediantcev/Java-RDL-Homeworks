package io.humb1t;

public class Task3 {
    private String name;

    public Task3(String name) {
        this.name = name;
        throw new RuntimeException("Task3 exception");
    }

    public static void main(String[] args) {
        Task3 task;
        try {
            task = new Task3("Some name");
            System.out.println("Объект создался, его имя " + task.name);
        } catch (Exception e) {
            throw e;
        }
    }
}
