package main.java.Stages;

import main.java.Helper.Member;
import main.java.Helper.Task;

public class Substage extends Task {

    public String getSubstageInfo() {
        return super.getTaskInfo();
    }

    public void appendMemberSubstage(Member a) {
        super.appendMember(a);
    }
}
