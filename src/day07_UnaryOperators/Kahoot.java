package day07_UnaryOperators;

public class Kahoot {
    public static void main(String[] args) {

        System.out.print("Result A"+0+1);
        //                  "Result A0"+1
        //                  "Result A01
        System.out.print(";Result B"+(1)+(2));//(1+2)=3
        //               "Result B1"+2
        //                "Result B12"

        System.out.println();

        System.out.println("5+2= "+3+4);
        //                 "5+2=3"
        //                 "5+2=34"
        System.out.println("; 5+2= "+(3+4));
        //                "; 5+2= "+7
        //                "; 5+2=7"

        System.out.println((3+2)*2/3%2);
        //                  5*2/3%2
        //                  10/3%2
        //                  3%2
        //1

        double a =10/3;//if you want to make exact answer(double)10 or if number already given to you 10d
        //     a=     3
        //  a=3.0

        System.out.println(a);

    }
}
