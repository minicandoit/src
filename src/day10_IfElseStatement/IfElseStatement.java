package day10_IfElseStatement;

public class IfElseStatement {
    public static void main(String[] args) {
        int number = 100;
boolean isEven=number%2==0;
        if (number % 2 == 0) {//for even number
            System.out.println(number + " is even");
        } //else {
          //  System.out.println(number + " is odd");

       // }
   if(!isEven){
       System.out.println(number+" is odd");
   }
        System.out.println("===================================");

   if (isEven){
       System.out.println(number+" is even");
   }else{
       System.out.println(" is odd");
   }
        System.out.println("======================================");

   int score =85;
   if(score>=60){
       System.out.println("passed exam");
   }else{
       System.out.println("failed exam");
   }



    }
}
