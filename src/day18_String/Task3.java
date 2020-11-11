package day18_String;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String sentence=scan.nextLine();
        System.out.println(""+ sentence.charAt(0) + sentence.charAt(sentence.length() - 1));

    }
}
