package day17_Strings;
import java.util.Scanner;
public class String_Task1 {

    /*
     1. write a program that ask user to enter sentence.
        then print out the first and last characters

     */
    public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
        System.out.println("Enter sentence");
     String str=input.nextLine();

        int len = str.length();
        char first = str.charAt(0);
        char last = str.charAt(len-1);
        System.out.println("First letter is: "+first);
        System.out.println("Last letter is: "+last);




    }






}
