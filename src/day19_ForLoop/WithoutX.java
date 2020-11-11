package day19_ForLoop;
import java.util.Scanner;
public class WithoutX {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        //                       system.in== represents input
        System.out.println("Enter a word");
    String word = scan.nextLine();

    if(word.toLowerCase().startsWith("x")){
        System.out.println(word.substring(1));//rest ending index no need to mention
    }else{
        System.out.println(word);
    }

        System.out.println("=====================");

    char firstChar=word.charAt(0);//char is not the object like string
    //we can not call the equal..
    if(firstChar=='x'||firstChar=='X'){
        System.out.println(word.substring(1));
    }else{
        System.out.println(word);
    }


        System.out.println("=======================");

    String s1=word.substring(0,1);
    //substring exclude ending index
        if(s1.equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }

    //if you want to erase all the x' them use replacement method







    }
}
/*
 2. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
                        xxcode
                        xcode

 */