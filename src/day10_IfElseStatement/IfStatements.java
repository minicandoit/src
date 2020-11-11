package day10_IfElseStatement;

public class IfStatements {
    public static void main(String[] args) {
int score=45;
if(score>=60){

        System.out.println("congrats");}

if(score<60){
    System.out.println("keep tring");}

        System.out.println("============================================");
if (score>=60){System.out.println("congrats");}else{System.out.println("keep tring");}

        System.out.println("=====================================");

  int angle1=80;
  int angle2=75;
  int angle3=65;
  int angle4=75;

  boolean isValidRectangle=angle1==90 && angle2==90&&angle3==90&&angle4==90;
  //                       false

  // if each of the angles are equal to 90, then it's valid rectangle

       /* if(isValidRectangle){
            System.out.println("It is valid rectangle");
        }
  if(!isValidRectangle){
      System.out.println("It is not valid rectangle");}

        */

        System.out.println("==================");
        if(isValidRectangle){
            System.out.println("It is valid rectangle");
        }else{System.out.println("It is not valid rectangle");}
        System.out.println("=============================");
//assume that a&b are two different numbers
int a=200;
int b=3000;
int max=0;//?temporaliy give a value 0

        //System.out.println("Maximumnumber is: "+max);==>max=0

// what is the maximum number
        if(a>b){
           max=a;
           // System.out.println("max: "+a);
        }else{
            max=b;
           // System.out.println("max: "+b);
        }

        System.out.println("Maximumnumber is: "+max);
//print statement always after the condition












    }
}

