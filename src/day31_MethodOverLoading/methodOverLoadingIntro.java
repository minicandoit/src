package day31_MethodOverLoading;

import java.util.Arrays;

public class methodOverLoadingIntro {
    public static void main(String[] args) {
method(10);//"10"compile error==>String
        method(5.5);

        System.out.println("===================");
int []arr1={3,4,5};
        Arrays.sort(arr1);
double[]arr2={2.5,0.5,1.5};
        Arrays.sort(arr2);
char[]arr3={'a','b','c'};
        Arrays.sort(arr3);
String[]arr4={"A","B","C"};
        Arrays.sort(arr4);




    }

    public static void method(){
        System.out.println("A");
    }

   public static void method(int a){
        //after giving int a to parameter now sharing the same method name

       System.out.println("B");
   }

   public static void method(String b){//(int b,int c){//number of the parameter different
       System.out.println("C");
   }
   public static void method(int a,String b){
       System.out.println("D");
   }
   public static void method(double a){
       System.out.println("E");
   }

}
