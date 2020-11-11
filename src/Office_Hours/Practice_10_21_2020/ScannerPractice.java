package Office_Hours.Practice_10_21_2020;
import day11_MultiBranchIf.Grade;

import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the score");
       int score=    scan.nextInt();
       scan. close();
      // char grade=' ';//temporary value
      String grade="";

      if(score>=90&&score<=100){
         /*
          if(score>=90){
              grade="A";//grade="Excellent"; you can assign more than one character
          }else if(score>=80){
              grade="B";
          }else if(score>=70){
              grade="C";
          }else if(score>=60){
              grade="D";
          }else{
              grade="F";
          }
          */

     grade=(score>=90)?"Excellent":(score>=80)?"Great":(score>=70)?"Good"
             :(score>=60)?"Pass":"Fail";

      }else{
         grade="Invalid";

      }

        System.out.println("Grade is: "+grade);



    }
}
/*
pre condition:0-100

A:90-100
B:80-89
C:70-79
D:60-69
F:0-59
 */