package day22_javaRecap;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        /*
        Scanner object:1
        max:1

        "enter a number":5
        nextInt():5

        "Maximum number is ...":1
         */

        Scanner scan=new Scanner(System.in);
        int max=-999999999;//
        //user most likely to enter a number
        //thats greater than -99999999

        for(int i=1;i<=5;i++);
        {
            System.out.println("Enter a number");
            int n = scan.nextInt();//-10,-20,-30....

            if (n > max) {

                max=n;
            }
        }

scan.close();
        System.out.println("max = "+max);



    }
}
