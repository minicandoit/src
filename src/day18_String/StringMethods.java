package day18_String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

String str="Cbertek";

str=str.concat(" School");//create new string by assigning "Cybertek School"
        System.out.println(str);

        String str2="Cybertek";
      // str2=str+123;//when you use + operator you can add any
        str2=str2+" school";//+ is more advanced than concat method

        System.out.println(str2);

        System.out.println("=================================");

        String name="bank of america";
        name=name.toUpperCase();//creates new version of object "BANK OF AMERICA"
        System.out.println("name ="+name);//still lowercase without reassigning name=

        name=name.toLowerCase();
        System.out.println("name ="+name);//"bank of america"
//without assigning name=  will be still uppercase
        System.out.println("=======================================");

        String t1="               Hello                    ";
        System.out.println(t1);

          t1=t1.trim();//"Hello"
        System.out.println(t1);

       String t2="Hello     Everyone";
       t2=t2.trim();
        System.out.println(t2);//spaces not between the words
        System.out.println("=======================================");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=scan.nextLine();
        firstName=firstName.trim();
        System.out.println("Enter your last name: ");
        String lastName=scan.nextLine();
        lastName=lastName.trim();

        System.out.println("First name is: "+firstName);
        System.out.println("Last name is: "+lastName);













    }
}
