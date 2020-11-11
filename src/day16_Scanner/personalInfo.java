package day16_Scanner;
import java.util.Scanner;
public class personalInfo {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName=input.nextLine();

        System.out.println("Enter your last name");
        String lastName=input.nextLine();

        System.out.println("Are you currently employed? True or false");
        boolean isEmployed=input.nextBoolean();

        double salary=0;
        if(isEmployed){
            System.out.println("What is your salary");
            salary=input.nextDouble();
        }
        System.out.println("Full name is: "+firstName+" "+lastName);
        System.out.println("Employed: "+isEmployed);
        System.out.println("salary: "+ salary);
    }
}
/*
Task -8Ask the user to enter their first name. Then ask the user to enter their last name.
Then ask the user if they are currently employed.
If the user is employed, also ask them what their salary is.
Print all the information at the end:”Full name is:” full name“Employed:” status“Salary:” salary
 */