package day09_IfStatement;

import java.util.SplittableRandom;

public class IfStatementPractice {
    public static void main(String[] args) {

        boolean isPandemic = true;//if the boolean is true then executed
        if (isPandemic) {
            System.out.println("wear mask");
            System.out.println("buy toilet papers");
            System.out.println("stay at home");
        }

        if (!isPandemic) {
            System.out.println("be free");
        }
        System.out.println("===============================");

        String name = "David";
        int age = 20;
        boolean isUSCitizen = false;
        boolean eligible = isUSCitizen == true && age >= 18&&age<=70;
        //                false&&  true==>false

        if (eligible) {
            System.out.println(name + " is eligible to vote");
        }

        if (!eligible) {
            System.out.println(name + " is not eligible to vote");
        }













    }
}
