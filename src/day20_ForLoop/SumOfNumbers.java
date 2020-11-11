package day20_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= scan.nextInt();//100
        scan.close();//no longer use any Scanner
        int result=0;

       if(num>=1) {
           for (int i = 1; i <= num; i++) {//used for calculating add them into result
               result += i;
           }
       }else{
           System.err.println("Invalid Entry");
       }
        System.out.println("result="+result);




    }
}
/*

    4. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050
                input: 50
                output: 1275

    5. write a program that can reverse any given string
            ex:
                input: abcd
                output: dcba
                input: Cybertek
                output: ketrebyC
    6. write a program that can verify if the user entered String is palindrome
            ex:
                input: Level
                output: Level is palindrome
                input: java
                output: java is not palindrome

 */