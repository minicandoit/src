package day19_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
/*
       for(int i=1; i<10;i++){
           System.out.println("Hello world");
           break;//only one time print ==>break the loop
           */

/*
1. print out the numbers between 0 ~ 1000
    2. print out the numbers between 1000 ~ 2000
    3. print out all the odd numbers between 0 ~ 100
    4. print out all the even numbers between 0 ~ 100
    5. do 50 push ups

 */

for(int i=0;i<=100;i++) {
//with i-- always true never stop, to make false i++ need to make loop stop
    System.out.print(i+" ");//with println each line printed
}//            to give a space

        System.out.println();//to give a new line for Hello
        System.out.println("Hello");


        System.out.println("======================================");
for(int i=1000;i<=2000;i++){//even though it's not mandatory with out it never stops
    System.out.print(i+" ");//because 1000<=2000 always true
}
        System.out.println();//to give a new line
        System.out.println("Hello");

        System.out.println("==================================");

        //1 3 5 7 9 11.....
        for(int i=1;i<=100;i+=2){
            System.out.print(i+"");//one line with space print
        }
        System.out.println();

        System.out.println("=======================================");

        for(int i=1; i<=100;i++){

           if(i%2!=0){
               System.out.println(i+"");
               System.out.println();
           }
        }
        System.out.println("=======================================");

//0 2 4 6 8 10 12 14...
        for(int i=0;i<=100;i+=2){
            System.out.print(i+" ");
            System.out.println();

        }

        System.out.println("==========================================");
for(int i=0;i<=100;i++){
    if(i%2==0){
        System.out.print(i+" ");

    }
}
        System.out.println();
        System.out.println("==============================================");

        for(int i=1;i<=500;i++){
            System.out.println("Push Up "+i);
        }

        System.out.println();

char a=65;
        System.out.println(a);
        /*
        A~Z
         */












       }







       // for(int i=1; i<=1000; i++){//if condition never gonna be false loop never stop
          //  System.out.println(i);}


/*
print out the numbers between 0~1000
 */


    }

