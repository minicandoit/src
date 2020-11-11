package day16_Scanner;
import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);//Scanner object


        System.out.println("Enter the browser type");
        String browser=input.nextLine();

         input.close();

        switch (browser) {
            case "chrome":
                System.out.println("chrome is opening");
            break;
            case "firefox":
                System.out.println("firefox is opening");
                break;
            case "opera":
                System.out.println("opera is opening");
                break;
            case "safari":
                System.out.println("safari is opening");
            break;
            case "internet explorer":
                System.out.println("internet explorer is opening");
            break;
            default:
                System.out.println(browser+" is not valid");

        }




    }
}
