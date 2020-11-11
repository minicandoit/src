package day20_ForLoop;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word=scan.nextLine();//"Java
        //why do we need to make object
        //we can use the methods
        int lastIndex=word.length()-1;
        char f=word.charAt(0);
        char l=word.charAt(lastIndex);
        System.out.println(""+f+l);//(f+l)returns me addition
        //""+f==>returns you string
        //because every single character has number

      String r1="Batch"+2+1;//Batch21

        System.out.println("========================");
         //String buildingNumber(next())
        //String street(nextLine())
        //String apartmentNumber;
        //String city(nextLine())
        //  String state(nextLine())
        //int zipCode

while(true) {
    System.out.println("Enter Building number");
    String buildingNumber = scan.next();
    scan.nextLine();

    System.out.println("Enter street name");
    String streetName = scan.nextLine();

    System.out.println("Enter your apartment number");
    String apartmentNumber = scan.next();
    scan.nextLine();

    System.out.println("Enter your city");
    String city = scan.nextLine();

    System.out.println("Enter your state");
    String state = scan.nextLine();

    System.out.println("Enter your zip code");
    int zipCode = scan.nextInt();

    String fullAddress = buildingNumber + " " + streetName + " "
            + apartmentNumber + "\n " + city + " " + state + " "
            + zipCode + " ";

    System.out.println("would you like to continue?Yes,No");
    String answer = scan.next();

    if (answer.equalsIgnoreCase("no")) {
        break;

    }
}


    }
}
