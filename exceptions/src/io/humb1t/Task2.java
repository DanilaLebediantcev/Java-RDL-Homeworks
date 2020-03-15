package io.humb1t;

public class Task2 implements AutoCloseable {

    private String name;

    public Task2(String name) {
        this.name = name;
        System.out.println("We created just now something with name " + name);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Method [close] worked");
    }

    public static void main(String[] args) throws Exception {
        try(Task2 object1 = new Task2("Tor")) {
            System.out.println("Block [try] worked ");;
        } catch (Exception e){
            throw e;
        }
    }
}
