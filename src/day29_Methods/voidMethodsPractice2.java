package day29_Methods;

import java.util.Scanner;

public class voidMethodsPractice2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

     sumOf3Numbers(10,20,30);
        sumOf3Numbers(40,30,10);
//sumOf3Numbers(scan.nextInt(),scan.nextInt(), scan.nextInt());
        greaterNumber(100,101);

    }

    public static void sumOf3Numbers(int n1,int n2,int n3){
        System.out.println("sum is: "+(n1+n2+n3));
    }
    public static void greaterNumber(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+" is greater");
        }else if(n2>n1){
            System.out.println(n2+" is greater");
        }else{
            System.out.println("Equal");
        }
    }






}

