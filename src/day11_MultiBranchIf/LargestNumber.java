package day11_MultiBranchIf;

public class LargestNumber {
    public static void main(String[] args) {
        int n1=100;
        int n2=300;
        int n3=400;

      //  boolean n1IsMax=n1>n2&&n1>n3;
       // boolean n2IsMax=n2>n1&& n2>n3;

       /* if (n1>n2&&n1>n3){
            System.out.println("first number is the Maximum number"+n1);
        }else if(n2>n1&& n2>n3){
            System.out.println("second number is the Maximum number"+n2);
        }else{
            System.out.println("third number is the Maximum number"+n3);
        }
        */


        if (n1>n2&&n1>n3){
            System.out.println("n1 is the Maximum number");
        }else if(n2>n1&& n2>n3){
            System.out.println("n2 is the Maximum number");
        }else{
            System.out.println("n3 is the Maximum number");
        }

        System.out.println("==========================");






    }
}
