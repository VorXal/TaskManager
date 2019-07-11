package main.java;

import java.util.ArrayList;

public class Task {
    private String name;
    private String description;
    private String deadline;
    private String note;
    //private ArrayList<String> members;

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

//    public String getMembers() {
//        StringBuilder membersS = new StringBuilder();
//            for(Object s: members){
//                membersS.append(s);
//                membersS.append("\t");
//            }
//        return membersS.toString();
//    }
//
//    public void setMembers(ArrayList<String> members) {
//        this.members = members;
//    }

    //other methods

    String getTaskInfo(){
        return "Task Name: " + getName() + "\n"
                + "Task Description: " + getDescription() + "\n"
                + "Task Deadline: "+ getDeadline() + "\n"
                + "Task Note: " + getNote() + "\n";
    }
}
