package day21_WhileLoops;

public class SwitchQuize {
    public static void main(String[] args) {
        int z=10;
        switch (z){
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            default:
                System.out.println("Friday");
        }

        String a="A";
        switch (a) {
            case "a":
                System.out.println("One");

            case "A":
                System.out.println("Two");


        }

        int year = 2021;
        String month = "Feb";

        String result = "";

        switch (month){
            case "Feb": result = (year%4 ==0)? "29 days" : "28 days";


            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov": result = "30 days"; // this is the or logic in switch statement


            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec": result = "31 days";
                break;

            default: result = "Invalid";

        }

        System.out.println(result);



        int n=10;

        switch (n) {
            case 10:
                System.out.println("Monday");

            case 11 :
                System.out.println("titugdhd");


            case 12:
                System.out.println("kkjhggh");




            default://for the last block we don't need to give break statement
                //not mandatory
                System.out.println("djdhg mom");
                // break;
        }



    }

}
