package day18_String;

import java.util.Scanner;

public class SubstringPractice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two words");
       String str1= scan.nextLine();
       String str2=scan.nextLine();

       String result=str1.substring(1, str1.length())+str2.substring(1,str2.length());

        System.out.println(result);







    }


}
/*
input:
apple
Banana
output:
ppleanana
 */