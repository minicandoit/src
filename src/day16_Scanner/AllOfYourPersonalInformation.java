package day16_Scanner;
import java.util.Scanner;
public class AllOfYourPersonalInformation {
    public static void main(String[] args) {
/*
ask:
    Count up some points based on the users input:
    Ask the user how many people they live with?
        if user lives with Less than 2 people: add one point
        if the user lives with 3 - 6 people: add two points
        if the user lives with more than 6 people: add three points
    Ask the user what city they live in?
    Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            if they have thought about it, add one point
            if no, minus one point
    Ask the user their favorite animal?
    Ask the user how many pets they want?
    Ask SSN?
    Print everything and points

 */
        Scanner input=new Scanner(System.in);
int points=0;
        System.out.println("how many people do you live with?");
    byte liveWithNumber= input.nextByte();
    if(liveWithNumber>0&&liveWithNumber<=12){
        if(liveWithNumber<=2){//only be 1 or 2
            System.out.println("Live with less than 2 poeple");
               // points++;//points +=1
        }else if(liveWithNumber>2&&liveWithNumber<7){//include 3-6

            System.out.println("Live with 3-6people");
            //points += 2;
        }else{//include 7-12
            System.out.println("You will with more than 6 people");
            //points +=3;
        }
    }else{
        System.err.println("Not a valid number of people");
    }

        System.out.println(points);
  //  if(liveWithNumber<=2){
  //      points++;
  //  }

   /*
    int num=0;
    if(num<=2) {
        System.out.println("add 1 point");
    }else if(num>=3&&num<=6){
        System.out.println("add 2 points");
    }else{
        System.out.println("add 3 points");
    }
*/









    }
}
