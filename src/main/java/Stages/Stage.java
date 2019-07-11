package main.java.Stages;

import main.java.Helper.Member;
import main.java.Helper.Task;

import java.util.ArrayList;

public class Stage extends Task {
    private ArrayList<Substage> substages = new ArrayList<>();

    public void addSubstage(Substage substage){
        substages.add(substage);
    }

    public String getStageInfo(){
        StringBuilder str = new StringBuilder();
        str.append(this.getTaskInfo());
        for(Substage substage: substages){
            str.append(substage.getSubstageInfo());
            str.append("\t");
        }
        return str.toString();
    }

    public void appendMemberStage(Member a) {
        super.appendMember(a);
    }
}
