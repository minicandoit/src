package day18_String;
import java.util.Scanner;
public class SubstringMethods {
    public static void main(String[] args) {


        String str="Today is Monday";
        //          0123456789
        String day=str.substring(9,14+1);//(9,14)y is missing
        System.out.println(day);

        String email="cybertek@gmail.com";
        //            0123456789
        String domain=email.substring(9,13);
        System.out.println("Domain of the email "+email+" is: "+domain);

        System.out.println("======================================");
String item="apple";
String s= item.substring(1,5);
String item2="banana";
String s2=item2.substring(1,6);
        System.out.println(s+s2);

        System.out.println("===============================");
        String s1="I like movies and books";
        //         01234567
        String word1=s1.substring(7,12+1);
        System.out.println(word1);
        String firstName="cYBERtek";//Cybertek
        String firstChar=firstName.substring(0,1).toUpperCase();

        String rest=firstName.substring(1,firstName.length()-1+1).toLowerCase();
        //          -1+1=0        so take them out    firstName.length()==same result
        System.out.println(firstChar);  //           lastChar+1
       // String name=firstChar+firstName.substring(1,5+1);
        System.out.println(rest);
        firstName=firstChar+rest;
        System.out.println(firstName);

        System.out.println("==========================================");

        /*
        ask the user to enter first and last names, then print out the full name
        input:
        cYbErTek
        sCHOOL
        output:
        Cybertek School
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String f=scan.nextLine();
        f=f.substring(0,1).toUpperCase()+f.substring(1,f.length()-1+1).toLowerCase();
        System.out.println("Enter your last name: ");
        String l=scan.nextLine();
        l=l.substring(0,1).toUpperCase()+l.substring(1,l.length()+1-1).toLowerCase();

        System.out.println("first name is: "+f);
        System.out.println("last name is: "+l);

        String fullName=f+" "+l;
        System.out.println("Full name is: "+fullName);











    }
}
