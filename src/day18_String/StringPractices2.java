package day18_String;
import java.util.Scanner;
public class StringPractices2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an Apple product name");
        String product=scan.nextLine();//mAc  BoOk
        product=product.replace(" ","").toLowerCase();
              //macbook
        switch (product){
            case "macbook":
                System.out.println("Which model of MacBook would like?");
                String model=scan.nextLine();
                if(model.equalsIgnoreCase("air")){
                    System.out.println("MacBook Air is $2400");
                }else if(model.equalsIgnoreCase("pro")){
                    System.out.println("MacBook pro is $2500");
                }else{
                    System.out.println("Invalid Model for MacBook");
                }
                break;

            case "iphone":
                System.out.println("Which model of Iphone would you like");
                String model2= scan.nextLine().toLowerCase();//automatically lower case
                if(model2.equals("12")){
                    System.out.println("Iphone 12 is $1000");
                }else if(model2.equals("11")){
                    System.out.println("Iphone 11 is $900");
                }else if(model2.equals("10")){
                    System.out.println("Iphone 10 is $800");
                }else if(model2.equals("8")){
                    System.out.println("Iphone 8 is $700");
                }else{
                    System.err.println("Invalid Model for Iphone");
                }

                break;

            case "Ipad":
                System.out.println("Which model of Ipad");
                String model3= scan.nextLine();
                switch (model3){
                    case "air":
                        System.out.println("Ipad air is $500");
                        break;

                    case "Pro":
                        System.out.println("Ipad pro is $400");
                        break;

                    case "mini":
                        System.out.println("Ipad mini is $300");
                        break;

                    default:
                        System.err.println("Invalid model for Ipad");
                }

                break;

            default:
                System.err.println("Invalid Product Name");
        }


    }
}
/*
MacBook:
air:2400
pro:2500

Iphone :
12:1000
11:900
10:800
8:700
Ipad:
air:500
mini:400
pro:300
 */