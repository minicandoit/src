package day17_Strings;
import java.util.Scanner;
public class Scanner_Review {
    public static void main(String[] args) {


       Scanner input=new Scanner(System.in); //make the Scanner object

        System.out.println("Pick a number from 1-10");
        byte num= input.nextByte();//Accept one byte value

       if(num>0&&num<11) {//make sure the number is in the range


           System.out.println("Can you enter that number as a word");
           String word = input.next();//Accept one word
boolean areMatching=false;
           switch (word){
               case "one":
               areMatching=(num==1);
               break;
               case "two":
                   areMatching=(num==2);//parenthesis not necessary
               break;
               case "three":
                   areMatching=(num==3);
                   break;
                   //we don't need a default
                    //cases four-ten
           }
           if(areMatching) {
               System.out.println("number: " + num);
               System.out.println("word: " + word);
           }else{
               System.out.println("The two inputs do not match");
           }

       }else{
           System.out.println(num+" was not between 1 - 10");
       }
input.close();

    }
}
