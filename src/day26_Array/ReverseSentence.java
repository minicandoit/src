package day26_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("Enter your sentence");
      String sentence=scan.nextLine();

    String[] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));


        String reverseSentence="";
        for(int i= words.length-1;i>=0;i--){
          reverseSentence+=words[i]+" ";
           // System.out.print(words[i]+" ");with out reverseSentence
        }//Monday is Today
reverseSentence=reverseSentence.trim();
        System.out.println(reverseSentence);









    }
}
