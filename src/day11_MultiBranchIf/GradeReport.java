package day11_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {

     int score =70;//0~100

        //boolean fail= score<60;
       // boolean pass=score>=60&&score<90;



        String result ="";//temporarily value

        if(score<60){
            result="Failed";
            //System.out.println("Fail");
        }else if(score>=60&&score<90){
            result="Passed";
            //System.out.println("Passed");
        }else{//score >=90
            result="Passed with distinction";
            //System.out.println("passed with distinction");
        }
        System.out.println(result);

    }
}
