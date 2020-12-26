package day38_Statics.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO,BA,SM;
    public ArrayList<Tester>testersTeam=new ArrayList<>();
    public ArrayList<Developer>developersTeam=new ArrayList<>();

    public static boolean hasSprint=true;
    public static boolean hasMeeting=true;

    public void setInfo(String PO,String BA,String SM ){
        this.PO=PO;
        this.BA=BA;
        this.SM=SM;
    }
    public void addTester(Tester tester){
        testersTeam.add(tester);
    }

    public void addTester(Tester[] testers){
        testersTeam.addAll(Arrays.asList(testers));
    }
    public void removeTester(String ID){
        testersTeam.removeIf(p->p.ID.equals(ID));

    }

    public void addDeveloper(Developer developer){
        developersTeam.add(developer);
    }
    public void addDeveloper(Developer[]developers){
        developersTeam.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(String ID){
        developersTeam.removeIf(p->p.ID.equalsIgnoreCase(ID));
    }

    public String toString(){
        return  "PO: "+PO+", BA: "+BA+", SM: "+SM+", Total Numbers of Testers: "+testersTeam.size()
        +", Total Number of Developers: "+developersTeam.size();
    }

}
