package main.java;

import main.java.Helper.Member;
import main.java.Helper.Task;

public class Main {
    public static void main(String[] args) {
        Member first = new Member();
        first.setName("Alexey");
        first.setSurname("Voronkov");
        first.setPosition("Developer");

        Task firsttask = new Task();
        firsttask.setName("First Task");
        firsttask.setDescription("Description of the First Task");
        firsttask.setDeadline("It's Deadline of the First Task");
        firsttask.setNote("Not for the First Task");
        firsttask.appendMember(first);
        System.out.println(firsttask.getTaskInfo());


    }
}
