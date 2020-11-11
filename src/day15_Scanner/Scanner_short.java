package day15_Scanner;
import java.util.Scanner;
//you can import all things with* but only we are using scanner
public class Scanner_short {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a short number: ");
        short s=scan.nextShort();
        System.out.println("Number is: "+s);

        System.out.println(scan.nextShort());
    }
}
