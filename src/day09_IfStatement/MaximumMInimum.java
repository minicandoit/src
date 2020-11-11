package day09_IfStatement;

public class MaximumMInimum {
    public static void main(String[] args) {

       int n1=100;
       int n2=200;

       //maximum
       boolean n1isMax=n1>n2;//n1 to be the maximum nember
       boolean n2isMax=n2>n1;//n2 to be the maximum nember


   if(n1isMax){
       System.out.println(n1+" is maximum");
   }
   if(n2isMax){
       System.out.println(n2+" is maximum");
   }

        //equal
        boolean equal=!n1isMax&&!n2isMax;//n1 is equal to n2
        //n1==n2;

        if(equal){
       System.out.println("both are equal");
   }
   //minimum
  boolean n1IsMin=n1<n2;// n1 is the minimum number
   boolean n2IsMin=n2<n1;//n2 is the minimum number

   if (n1IsMin){
       System.out.println("n1 is minimum");
   }
  if(n2IsMin){
      System.out.println("n2 is minimum");
  }





    }
}
/*
2. write a program that can print out the maximum number between two numbers
        Ex:
            num1 = 20;
            num2 = 30;
            output:
                30 is the maximum number
            num1 = 20;
            num2 = 20;
            output:
                both numbers are equal
    3. write a program that can print out the minimum number between two numbers
        Ex:
            num1 = 20;
            num2 = 30;
            output:
                20 is the minimum number
come back at: 12:30

 */