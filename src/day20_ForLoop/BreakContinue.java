package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        for(int i=1;i<=10;i--){//i:1,0,-1...... so only one time executed

            if(i<1){
                break;//exits the loop immedietly
            }
            System.out.println("Hello Batch 21");

        }
        System.out.println("===========================================");

        Scanner scan=new Scanner(System.in);

        for(int i=0;i==0;) {

            System.out.println("Enter two numbers: ");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println("Enter math operator");
            char operator=scan.next().charAt(0);
           int  result=0;
           /*
            switch (operator){
                case '*' :
                    n1*n2;
            }
            */
            System.out.println("Sum is: " + (n1 + n2));
            System.out.println("would you like to continue?Yes,No");
            String answer = scan.next();

           if(answer.equalsIgnoreCase("no")){
                break;
           }
        }






        /*
        1.ask user to enter two numbers and then print sum of those two numbers
        2.ask user , would you like to continue?Yes,No
               if answer is yes-->repeat
               if answer is no-->exit loop
         */













    }
}
