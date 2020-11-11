package day22_javaRecap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

                int min=2147483647;
                int max=-2147483648;

                for(int i=1;i<=5;i++){
                    System.out.println("Enter a number");
                    int n=scan.nextInt();

                    if(n<min){//if the input is smaller than previous min number
                        min=n;
                    }
                    if(n>max){//if the input is greater than previous max number
                        max=n;
                    }


                }
        scan.close();
        System.out.println("min is :"+min);
        System.out.println("Max is :"+max);

    }
}

