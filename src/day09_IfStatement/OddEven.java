package day09_IfStatement;

public class OddEven {
    public static void main(String[] args) {
       int number=200;
       boolean isEvenNumber=number%2==0;
      // boolean isOddnumer=!isEvenNumber;

       if(isEvenNumber){
           System.out.println(number+" is even number");

       }
      if(!isEvenNumber) {
          System.out.println(number+" is odd number");
      }


   /*     System.out.println(number+" is even number: "+isEvenNumber);
       // System.out.println(number+" is Odd number: "+isOddnumer);
       int number1= 101;
        System.out.println(number1+" is odd number: "+isEvenNumber);
    */


    }

}
