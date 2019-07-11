package main.java;


public class Main {
    public static void main(String[] args) {
        Task firsttask = new Task();
        firsttask.setName("First Task");
        firsttask.setDescription("Description of the First Task");
        firsttask.setDeadline("It's Deadline of the First Task");
        firsttask.setNote("Not for the First Task");
        System.out.println(firsttask.getTaskInfo());
    }
}
