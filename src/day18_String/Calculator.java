package day18_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number: ");
        double n1=scan.nextDouble();

        System.out.println("Enter math operator: ");//*,/,%,+,-
        char operator= scan.next().charAt(0);

        System.out.println("Enter a number");
        double n2=scan.nextDouble();

       boolean isValid=operator=='*'||operator=='/'
               ||operator=='%'||operator=='+'||operator=='-';

       // double result=0; you can just print it as a print statement

        if(isValid){
            if(operator=='*'){
                System.out.println("Multiplication: "+(n1*n2));
            }else if(operator=='/'){
                System.out.println("Division: "+(n1/n2));
            }else if(operator=='%'){
                System.out.println("Remainder: "+(n1%n2));
            } else if (operator == '+') {

                System.out.println("Addition: "+(n1+n2));
            }else{
                System.out.println("Subtraction: "+(n1-n2));
            }
        }else{
            System.err.println("Invalid operator is entered");//serr==error message
        }











    }

}
