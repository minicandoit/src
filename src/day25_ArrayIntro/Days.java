package day25_ArrayIntro;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        String[]days={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        System.out.println("Enter the number");
        int num =scan.nextInt();
        System.out.println(days[num-1]);


    }
}
