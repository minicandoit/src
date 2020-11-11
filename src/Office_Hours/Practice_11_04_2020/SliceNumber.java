package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class SliceNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=scan.nextInt();


        int number=12345;
       int digit1=number/10000;//int/int==>decimal==>impossible
       //         12345/10000=1
        int digit2=number%10000/1000;
        //         12345%10000/1000==2
        int digit3=number%10000%1000/100;
        int digit4=number%10000%1000%100/10;
       //          2345%1000=345%100=45/10
        int digit5=number%10000%1000%100%10;

        System.out.println("digit1: "+digit1);
        System.out.println("digit2: "+digit2);
        System.out.println("digit3: "+digit3);
        System.out.println("digit4: "+digit4);
        System.out.println("digit5: "+digit5);




    }
}
