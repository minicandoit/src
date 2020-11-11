package day25_ArrayIntro;

import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;
        while (true) {


            System.out.println("Which room would you like to select?");
            System.out.println("\t\tA. King Bed==$120");
            System.out.println("\t\tB.Queen Bed==$100");
            System.out.println("\t\tC.Single Bed==$80");

            String word = scan.nextLine().toLowerCase();


            while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {

                System.out.println("Invalid Entry, please Re-Enter");
                word = scan.nextLine().toLowerCase();
            }
            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

// to make sure user selected
            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {//while the answer is not valid answer
                System.out.println("Invalid Entry, Please Re-Enter");
                System.out.println("would you like to select another room");
                a = scan.nextLine().toLowerCase();
            }//if stops if the answer is either ye or no
            if (a.equals("no")) {
                System.out.println("Your total price is: $" + total);
                break;

            }
        }
    }
    // to make sure user selected


}

