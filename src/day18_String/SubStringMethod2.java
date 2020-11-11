package day18_String;

import java.util.Scanner;

public class SubStringMethod2 {
    public static void main(String[] args) {

        String str="Today is Monday";
        //         0123456789
        String day1=str.substring(9,str.length());
                               // (9) same result

        System.out.println(day1);
        System.out.println("==================================");

        Scanner scan= new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName=scan.next();//Cybertek
        //String firstName="cyBeRTek";//Cybertek

        firstName=firstName.substring(0,1).toUpperCase()
                  +firstName.substring(1).toLowerCase();
                                     //ending index doesn't need


        System.out.println("Last Name: ");
        String lastName= scan.next();

       lastName= lastName.substring(0,1).toLowerCase()+lastName.substring(1).toLowerCase();
        //no need for mention ending index when you do till the end
        String fullName=firstName+" "+lastName;
        System.out.println("Full Name: "+fullName);










    }
}
