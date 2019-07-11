package main.java.Stages;

import main.java.Helper.Member;
import main.java.Helper.Task;

import java.util.ArrayList;

public class MainStage extends Task {
    private ArrayList<Stage> stages = new ArrayList<>();

    public void addStage(Stage stage){
        stages.add(stage);
    }

    public String getMainStageInfo(){
        StringBuilder str = new StringBuilder();
        str.append(this.getTaskInfo());
        for(Stage stage: stages){
            str.append(stage.getStageInfo());
            str.append("\t");
        }
        return str.toString();
    }

    public void appendMemberMainStage(Member a) {
        super.appendMember(a);
    }
}
