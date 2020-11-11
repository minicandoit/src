package day17_Strings;
import java.util.Scanner;
public class Scanner_Review2 {
    public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
        System.out.println("Enter the product name");
        String product=input.nextLine();
        //there's no enter above it ,no scanner before it
        System.out.println("Enter the price");
        double price= input.nextDouble();
        System.out.println("Enter the quantity");

        input.nextLine();//the enter from the above method will be absorbed

        int quantity= input.nextInt();//we have to hit enter to submit the information

        input.nextInt();//the enter from the above will be absorbed

        System.out.println("Enter their full name");

        String fullName= input.nextLine();
        System.out.println("Enter your address");
        String address=input.nextLine();

        System.out.println(fullName+" your order for "+quantity+" "+product+" has been placed.Your total is "+price);

        System.out.println(product);//right now is ok
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(fullName);



    }
}
