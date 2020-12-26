package day36_Custonclass;

import java.util.Scanner;

public class fibonacci1 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    fib(num);
}

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int sum=0;
        int j=0,z=1;

        for(int i=1;i<num;i++){

            sum=j+z;//0+1==>j=0,  z=1==>j=1,  z=1==>j=1,z=2
            j=z;//j=1==>j=1==>j=2
            z=sum;//z=1==>z=2==>z=3
        }
        System.out.println(sum);

    }
}
/*
 public static void fib(int num){
    //WRITE YOUR CODE HERE

    int sum=0;
    int j=0,z=1;

        for(int i=1;i<num;i++){

            sum=j+z;//       j=0,z=1==> j=1,z=1==>   j=1,z=2
            j=z;//               j=1==>     j=1==>.      j=2
            z=sum;//.            z=1==>.    z=2==>.      z=3
        }
         System.out.println(sum);

 */