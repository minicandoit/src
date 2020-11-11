package day13_SwitchStatement;

public class SwitchStatement_Practice1 {
    public static void main(String[] args) {
      int n=5;
      String day="";
      switch (n){
          case 1: day="Monday";
              //System.out.println("Monday");
               break;
          case 2: day="Tuesday";
              //System.out.println("Tuesday");
               break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Thursday");
              break;
          case 5:
              System.out.println("Friday");
              //case closed
          case 6:
              System.out.println("saturday");
              break;//not mandatory but without it gets compile error
          case 7:
              System.out.println("Sunday");
              break;
          default://for the last block we don't need to give break statement
              System.out.println("Invalid");//not mandatory
             // break;










       /*
        switch (2){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;

        */


        }

    }
}
