package day26_Array;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner  scan=new Scanner(System.in);
        System.out.println("How many number?");
        int length=scan.nextInt();

        int[]number=new int[length];
        int sum=0;
        for(int i=0;i<length;i++){
            System.out.println("Enter a number");
            number[i]=scan.nextInt();
            sum+=number[i];


        }
        double average=(double)sum/length;
        System.out.println("sum ="+sum);
        System.out.println("Average ="+average);















    }
}
/*
 5. Write a program that can return the average number from user inputs
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]
                average: 9

 */