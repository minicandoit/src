package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnteredNumbers {
    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);
       /*
        System.out.println("Enter a number");
        int n1=scan.nextInt();
        System.out.println("Enter a number");
        int n2=scan.nextInt();
        System.out.println("Enter a number");
        int n3=scan.nextInt();
        System.out.println("Enter a number");
        int n4=scan.nextInt();
        System.out.println("Enter a number");
        int n5=scan.nextInt();

int result=n1+n2+n3+n4+n5;
        System.out.println("sum: "+result);
*/
       int times= scan.nextInt();//how many number user wants to enter
int result=0;//temporary number//+1=1+2=3+3=6+4=10+5=15
        //to contain the sum of each user entered number
for(int i=3;i<=times;i++){//i<=scan.nextInt();
    //give the first user input
    System.out.println("Enter a number: "+i);
   result+= scan.nextInt();//each user input will be added to result

}

        System.out.println("result: "+result);
//outside of loop if you want an one time print

    }
}
/*

    3. write a program that can calculate the sum of 5 user entered inputs

 */