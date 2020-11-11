package day07_UnaryOperators;

public class EvenlyDivisibility {
    public static void main(String[] args) {
int number=65;
int reminderOf2=number%2;//1
       // System.out.println(reminderOf2);
        //<1
   boolean divisibleby2=reminderOf2<1;
           //1<1
      //  System.out.println(divisibleby2);
        System.out.println(number+" is divisible by 2: "+divisibleby2);
int remainderOf3=number%3;//2
boolean divisibleBy3=remainderOf3<1;
//2<1=====>false
        System.out.println(number+" is divisible by 3: "+divisibleBy3);

int remainderOf5=number%5;//0
boolean dibisibleby5=remainderOf5<1;
//0<1=====>true
        System.out.println(number+" is divisible by 5: "+dibisibleby5);
/*     what I tried
boolean isDivisibleBy2 =num%2<1;
boolean isDivisibleBy3=num%3<1;
boolean isDivisibleBy5=num%5<1;
        System.out.println(num+" is divisible by 2: "+isDivisibleBy2);
      */
    }
}
/*
 2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true

 */