package day11_MultiBranchIf;

public class Grade {
    public static void main(String[] args) {
        int score=91;
        char grade=' ';//String grade="";
        if(score>=90){//becomes false when score<90
            grade='A';//&&score<=100 ==don't need
        }else if(score>=80){//becomes false when score <80
           grade= 'B';//<90,&&score<=89==no necessary
        }else if(score>=70){//become false when score <70
            grade='C';//<80, &&score<=79
        }else if(score>=60){// becomes false when score<60
            grade='D';//<70,&&score<=79
        }else{
            grade='F';
        }

        System.out.println("Your grade is: "+grade);

        System.out.println("=========================");

        String grade2="";
         if(score>=90){//becomes false when score is <90
             grade2="A";
         }else if(score>=80){//becomes false when score<80
             grade2="B";
         }else if(score>=70){//becomes false when score <70
             grade2="C";
         }else if(score>=60){//becomes false when score <60
             grade2="D";
         }else{
             grade2="F";
         }
        System.out.println("Your grade is: "+grade2);










    }
}
