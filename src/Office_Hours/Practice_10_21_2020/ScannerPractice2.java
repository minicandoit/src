package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//Enter Enter(key)
//enter is left in Scanner,another Enter from tomato left
        System.out.println("Enter a price");
        double price=scan.nextDouble();//80Enter
//double methods takes only double 80
        System.out.println("price: "+price);

        System.out.println("Enter the name of the item");
        String item=scan.next();//tomato
//only takes tomato only
        System.out.println("item: "+item);//
        scan.nextLine();//I will call one more nextLine()Methods
        //EnterEnter  this method will take all of them
        //after any other method of Scanner whenever you are using nextLine()method
        System.out.println("Enter your full name");
        String fullName=scan.nextLine();//EnterEnter//Cybertek School
scan.close();
//after used last scanner
//without scan.nextLine();
//still 2Enter keys left in Scanner
        //I need takes out enters from the Scanner
        System.out.println("Full name is: "+fullName);


























    }
}
