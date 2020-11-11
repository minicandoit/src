package day16_Scanner;
import java.util.Scanner;
public class DynamicCalculator {
    public static void main(String[] args) {
/*
Task -9Create a dynamic calculatorAsk user to enter two numbers and an operator
Ex:Enter number 15Enter number 210Enter the operator+Output:  5 + 10 = 15
 */

        Scanner input=new Scanner(System.in);//make the scanner object

        System.out.println("Enter number one");//accepting the first number
        double num1=input.nextDouble();
        System.out.println("Enter number two");//accepting the second number
        double num2=input.nextDouble();
        System.out.println("Enter the operator");//accepting the operation
        String operator=input.next();
       input.close();//closing the scanner because we have all the inputs
double result=0;
boolean isValid=true;
switch (operator){
    case"plus":
    case"+":
        result=num1+num2;
        break;
    case"-":
        result=num1-num2;
        break;
    case"x":
    case"*":
        result=num1*num2;
        break;
    case"/":
        result=num1/num2;
        break;
    case"%":
        result=num1%num2;
        break;
    default:
        System.out.println(operator+" is invalid");
        isValid=false;//to stop printing below result when it's invalid


}
if(isValid){
        System.out.println(num1+operator+num2+"="+result);}
else{
    System.out.println(operator+"is invalid");
}

      //  System.out.println(result); my way
    }
}
