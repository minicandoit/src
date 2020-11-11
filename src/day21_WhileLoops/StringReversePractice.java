package day21_WhileLoops;

import java.util.Scanner;

public class StringReversePractice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String word=scan.nextLine();//"java"
        //                             0123

        String reversedWord="";

        int lastIndex=word.length()-1;
        for(int i=lastIndex;i>=0;i--){
          //  System.out.print(word.charAt(i));

           reversedWord +=word.charAt(i);
        }

        System.out.println("reversed Word: "+reversedWord);

        boolean isPalindrome=word.equalsIgnoreCase(reversedWord);
        System.out.println(isPalindrome);//racecar






    }
}
