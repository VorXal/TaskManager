package main.java;
import java.io.*;

import main.java.Helper.Member;
import main.java.Stages.Branch;
import main.java.Stages.MainStage;
import main.java.Stages.Stage;
import main.java.Stages.Substage;

public class Main {
    public static void main(String[] args) {
        Member first = new Member();
        first.setName("Alexey");
        first.setSurname("Voronkov");
        first.setPosition("Developer");
        Member second = new Member();
        second.setName("Roman");
        second.setSurname("Limonov");
        second.setPosition("Developer");

        Branch mainBr = new Branch();
        MainStage mainSt = new MainStage();
        mainSt.setName("1");
        MainStage mainSt2 = new MainStage();
        mainSt2.setName("2");
        Stage stage = new Stage();
        stage.setName("1.1");
        Stage stage2 = new Stage();
        stage2.setName("1.2");
        Stage stage3 = new Stage();
        stage3.setName("2.1");
        Stage stage4 = new Stage();
        stage4.setName("2.2");
        Substage substage = new Substage();
        substage.setName("1.1.1");
        Substage substage2 = new Substage();
        substage2.setName("1.1.2");
        Substage substage3 = new Substage();
        substage3.setName("1.2.1");
        Substage substage4 = new Substage();
        substage4.setName("1.2.2");
        Substage substage5 = new Substage();
        substage5.setName("2.1.1");
        Substage substage6 = new Substage();
        substage6.setName("2.1.2");
        Substage substage7 = new Substage();
        substage7.setName("2.2.1");
        Substage substage8 = new Substage();
        substage8.setName("2.2.2");



        mainBr.addMainStage(mainSt);
        mainBr.addMainStage(mainSt2);
        mainSt.addStage(stage);
        mainSt.addStage(stage2);
        mainSt2.addStage(stage3);
        mainSt2.addStage(stage4);
        stage.addSubstage(substage);
        stage.addSubstage(substage2);
        stage2.addSubstage(substage3);
        stage2.addSubstage(substage4);
        stage3.addSubstage(substage5);
        stage3.addSubstage(substage6);
        stage4.addSubstage(substage7);
        stage4.addSubstage(substage8);

        try(FileWriter writer = new FileWriter("result.txt", false))
        {
            writer.write(mainBr.getBranchInfo());

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
