package main.java.Stages;

import java.util.ArrayList;

public class Branch {
    private ArrayList<MainStage> mainStages = new ArrayList<>();

    public void addMainStage(MainStage mainStage){
        mainStages.add(mainStage);
    }

    public String getBranchInfo(){
        StringBuilder str = new StringBuilder();
        for(MainStage ms: mainStages){
            str.append(ms.getMainStageInfo());
            str.append("\t");
        }
        return str.toString();
    }
}
