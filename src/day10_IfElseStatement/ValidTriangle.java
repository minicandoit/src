package day10_IfElseStatement;

public class ValidTriangle {
    public static void main(String[] args) {

        double angle1 = 60;
        double angle2 = 30;
        double angle3 = 90;

        boolean isVaild = (angle1 + angle2 + angle3) == 180;
// if sum of three angles equal to 180, then it's valid triangle==>true
//otherwise ==>false

        if (isVaild) {
            System.out.println("it's a valid triangle");
        }

        if (!isVaild) {

            System.out.println("it is not a valid triangle");
        }

     //if it is a valid triangle, then check if it's a right triangle







       /* int angle1=50;
        int angle2=40;
        int angle3=90;
        boolean isValid = angle1+angle2+angle3==180;
        if(isValid){

            System.out.println("is valid");


            Task01: ValidTriangle
         A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.


        */


    }
}