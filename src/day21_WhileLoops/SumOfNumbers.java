package day21_WhileLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int result=0;//5+10=15+20=35==number will be added to the result

        for(int i=0;i<1;){
//to give infinite loop int i=0;i<1; this two always should be true
            System.out.println("Enter a number");
          int num=  scan.nextInt();//5,10
//assign to int variable to reuse it
            if(num<0){//if the user entered number is negative, it will not be added to the result
                break;


            }
            result+=num; //if else can be used
        }
        scan.close();
        System.out.println("result= "+result);
        //unless loop doesn't finish printline can't be printed





    }
}
/*
1.  Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

 */