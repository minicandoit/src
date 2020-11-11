package day16_Scanner;
import java.util.Scanner;
public class Scanner_next {
    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);

        System.out.println("Enter your first name");
       String firstName=input.next();

        System.out.println("Enter your last name");
        String lastName=input.next();

        System.out.println("Full Name is: "+firstName+" "+lastName);






    }
}
