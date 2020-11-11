package day15_Scanner;
import java.util.Scanner;
// import day14_Switch_Recap.SalaryCalculator;
// if we wanted to use the salaryCalulcator class in this class,we import
public class Scanner_Int {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number one:");
        int numOne=scanner.nextInt();//reading an int number
//int numOne=9000;->Hard coding/fixed value,
        //but with Scanner it can be dynamic
        System.out.println("Enter number two:");
        int numTwo=scanner.nextShort();//reading an int number

        System.out.println("Number one: "+numOne);
        System.out.println("Number two: "+numTwo);
        System.out.println("Sum"+(numOne+numTwo));

        // All the objects are print statement,using the variable we have
    }
}
