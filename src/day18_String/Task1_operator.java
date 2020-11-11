package day18_String;
import  java.util.Scanner;
public class Task1_operator {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=scan.nextInt();
        System.out.println("Enter math operator");
        char operator=scan.next().charAt(0);
        System.out.println("Enter a number");
        int n2= scan.nextInt();
         boolean isValid=operator=='*' || operator=='/'|| operator =='%' || operator =='+' || operator=='-';

        if(isValid){
            if(operator == '*'){
                System.out.println("Multiplication: " + (n1*n2)  );
            }else if(operator == '/'){
                System.out.println("Division: "+ (n1/n2) );
            }else if(operator == '%'){
                System.out.println("Remainder: "+(n1%n2));
            }else if(operator == '+'){
                System.out.println("Addition: "+ (n1+n2));
            }else{
                System.out.println("Subtraction: "+ (n1-n2));
            }

        }else{
            System.err.println("Invalid Operator is entered");
        }



    }
}
/*
 ex:
            num1 = 10;
            num2 = 20;
            operator = *
            output:
                    200
            num1 = 30
            num2 = 5
            operator = /
            output:
                    6

        pre condition:
                valid math operators are *, /, -, +, %

 */