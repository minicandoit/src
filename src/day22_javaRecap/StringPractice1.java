package day22_javaRecap;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {

        /*
        substring:creates substring from substring
        substring(beg,end):creates substring from beginning index
        till the given ending index(excluded)
        substring(beg):creates substring from beginning index till the end of string
         */
        String sentence="My name is mini";


        String name=sentence.substring(11,sentence.length()-1+1);
        //length()-1 ==>last character so need to +1 ==>don't need to put any
        //so (11,sentence.length())
        System.out.println(name);

String name2=sentence.substring(11);//from the beginning to the end ==>mini
        System.out.println(name2);

        String str1="Monday is cool,it's a fun day";
        //           012345
        String day=str1.substring(0,6);//without giving 6 whole sentence will be printed
        System.out.println(day);

        String day2=str1.substring(0,str1.indexOf(" "));//first space==use indexOf

        System.out.println(day2);

        String s1="https://www.amazon.com";//.com,.edu,.net,.gov
        String domain=s1.substring(s1.lastIndexOf(".")+1);
        System.out.println(domain);
        String name3=s1.substring(s1.indexOf(".")+1,s1.lastIndexOf("."));
//                   s1.substring(s1.indexOf("w.")+1
//s1.substring(s1.indexOf(".")==>first .
       // s1.lastIndexOf(".")==>last .


   name3= name3.substring(0,1).toUpperCase()+name3.substring(1);//Amazon
        System.out.println(name3);



        System.out.println("================================");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=scan.nextLine().toLowerCase().replace(" ","");

        System.out.println("Enter your last name: ");
        String lastName=scan.nextLine().toLowerCase().replace(" ","");
        //to the lowercase first
scan.close();
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        String fullName=firstName+" "+lastName;

        System.out.println("Full name= "+fullName);












    }
}
