package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//EnterEnter

        System.out.println("Enter your gender");//Female
        String gender=scan.next();

        System.out.println("Enter your age");//28
        int age=scan.nextInt();

        scan.nextLine();//EnterEnter
        //now scanner is empty

        System.out.println("Enter your full name");
        //this is only method that takes everything
        //regardless how many enters left you need to take out
        String fullName=scan.nextLine();

        System.out.println("Enter your zipcode");
        int zipcode=scan.nextInt();//22035Enter
//this method ignore the enter key only takes 22035
        //a Enter will be left in Scanner
        
        scan.nextLine();
        System.out.println("Enter your country name");
        String countryName=scan.nextLine();

        System.out.println("Enter your salary");
        double salary=scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter company name");
        String companyName=scan.nextLine();
    }
}
/*
1.ask gender(next())
2.ask age(nextInt())
3.ask full name(nextLIne())
4.ask zipcode(nextInt())
5.ask country name(nextLine())
6.ask salary(nextDouble())
7.ask company name(nextLine())

 */