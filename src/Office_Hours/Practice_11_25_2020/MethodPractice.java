package Office_Hours.Practice_11_25_2020;

public class MethodPractice {
    public static void main(String[] args) {
        divisibleBy3Between1To100();
        System.out.println("hello");
        divisibleBy3(50,50);
        System.out.println("Test");//doesn't  get effected by return so print
    //if System.exit(0); "test"will not be printed

        grade(90);
        eligibleToVote(18,true);

    }

    public static void divisibleBy3Between1To100(){
        for(int i=1;i<=100;i++){

            if(i%3!=0){
                continue;//then skip
            }
            System.out.print(i+" ");
            /*
            if(i%3==0){
                System.out.print(i+" ");
            }

             */
        }
       System.out.println();

    }

    public static void divisibleBy3(int start,int end){

       if(end<=start){
           System.out.println("Invalid numbers");
         // System.exit(0);//it terminates entire program
           return;//exits the current method for loop will not be executed

       }
        for(int i=start;i<=end;i++){

            if(i%3!=0){
                continue;//then skip
            }
            System.out.print(i+" ");
            /*
            if(i%3==0){
                System.out.print(i+" ");
            }

             */
        }
        System.out.println();

    }

    public static void grade(int score){

      if(score<0||score>100){
          System.out.println("Invalid Score");
          return;//exits the current method grade
      }//if it's string instead of char replace with ""
        char grade=(score>=90)?'A':(score>=80)?'B':(score>=70)?'C'
                :(score>=60)?'D':'F';
      switch (grade){
          case 'A':
              System.out.println("Excellent, you made an A");
              break;
          case'B':
              System.out.println("Great, you made a B");
              break;//never mandatory but without it next case executed
          case'C':
              System.out.println("Good, you made a C");
              break;
          case'D':
              System.out.println("You passed");
              break;
          default:
              System.out.println("You failed");

      }
    }

    public static void eligibleToVote(int age,boolean isUSCitizen){

        if(age<18){
            System.out.println("You must be at least 18 years old");
            return;
        }
        if(isUSCitizen==false){
            System.out.println("You must be a US citizen to vote ");
            return;//without return print will both
        }
        System.out.println("You are eligible to vote");





    }


}
