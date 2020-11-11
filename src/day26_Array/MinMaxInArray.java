package day26_Array;

import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length=scan.nextInt();
        //array size is fixed
        int[]numbers=new int[length];
        //assign to new keyword
        for(int i=0;i<length;i++) {//gets the user input and stores into the array from index 0
           // for(int i=1;i<length;i++) ==>same result
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }
        int min=numbers[0];
        int max=numbers[0];

        for(int i =0;i<length;i++) {
            if(numbers[i]> max) {
                max = numbers[i];
            }
            if(numbers[i]<min) {

                min=numbers[i];
            }

        }
        System.out.println("max="+max);
        System.out.println("min="+min);







        }
    }
