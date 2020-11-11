package day21_WhileLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scan.nextInt();//int num =3; before assign to scanner
        //3: 3*2*1
        //4: 4*3*2*1
        //5: 5*4*3*2*1
        int result=1;//3,2,1 that's wyh result=1
//any number*1=any number
        for(int i=num;i>=1;i--){
            //if it's double==>int i=(int)num;i>=1;i--
            //if i>=1 multiplcation will be work
            result*=i;//3,2,1

        }
        System.out.println("result = "+result);








    }
}
/*
 2.  Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */