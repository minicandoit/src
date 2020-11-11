package day15_Scanner;
import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {

        Scanner info=new Scanner(System.in);

        System.out.println("Enter the age: ");
        byte age=info.nextByte();
        System.out.println("Enter the favorite number: ");
        long Favnum=info.nextLong();
        System.out.println("Are you a student?Enter true or false ");
        boolean isStudent=info.nextBoolean();

        System.out.println("Age: "+age);
        System.out.println("Favorite number: "+Favnum);
      //  System.out.println("Are you a student?: "+isStudent);

        if(isStudent){
            System.out.println("Great, you are a student!");
        }else{
            System.out.println("Oh okay, you are not a student");
        }






    }
}
