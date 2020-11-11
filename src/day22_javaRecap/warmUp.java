package day22_javaRecap;

import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1=scan.nextInt();
        System.out.println("Enter number2:");
        int num2=scan.nextInt();
        System.out.println("Enter number3:");
        int num3=scan.nextInt();
        System.out.println("Enter number4:");
        int num4=scan.nextInt();
        System.out.println("Enter number5");
        int num5=scan.nextInt();

        String result=(num1>num2&&num1>num2&&num1>num3&&num1>num4&&num1>num5)?
                "num1 is maximum":(num2>num1&&num2>num3&&num2>num4&&num2>num5)?
                "num2 is maximum":(num3>num1&&num3>num2&&num3>num4&&num3>num5)?
                "num3 is maximum":(num4>num1&&num4>num2&&num4>num3&&num4>num5)?
                "num4 is maximum":"num5 is maximum";
        System.out.println(result);





    }
}
/*
  1.  write a program that asks user to enter 5 numbers and retuns the maximum number
    2.  write a program that asks user to enter 5 numbers and returns the minimum number
    3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput:
                        3 with a remainder of 1

 */