package day14_Switch_Recap;

public class If_Practice {
    public static void main(String[] args) {

        //if&else: 2 options
        int n=10000;
        if(n%2!=0){//for Odd
            System.out.println(n+" is odd number");
        }else{
            System.out.println(n+ " is even number");
        }


        System.out.println("===========================");

        int age=0;
        if(age>=18){
            System.out.println("you are eligible to get licence");
        }else{
            System.out.println("not eligible to get licence");
        }

        char grade='A';
        if(grade=='A'||grade=='B'||grade=='C'){
            System.out.println("You passed the class");
        }else{
            System.out.println("You did not pass the class");
        }

        System.out.println("===========================================");
//else if: 3 or more options

        int n1=100;
        int n2=200;

        if(n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }else if(n2>n1){
            System.out.println(n2+" is greater than "+ n1);
        }else {//n1==n2
            System.out.println(n1+" is equal to"+ n2);
        }//after else no else if==>compile error
        //else is not mandatory

int num=1;//1~7  the reason why no curly braces is one statement only
        if(num==1) System.out.println("Today is Monday");
        if(num==2) System.out.println("Today is Tuesday");
        if(num==3) System.out.println("Today is Wednesday");
        if(num==4) System.out.println("Today is Thursday");
        if(num==5) System.out.println("Today is Friday");
        if(num==6) System.out.println("Today is Saturday");
        else System.out.println("Today is Sunday");
        //more than one statement with curly braces
/*
        if(num==1){
            System.out.println("Today is Monday");
        }else if(num==2){
            System.out.println("Today is Tuesday");
        }else if(num==3) {
            System.out.println("Today is wednesday");
        }else if(num==4) {
            System.out.println("Today is Thursday");
        }else if(num==5) {
            System.out.println("Today is Friday");
        }else if(num==6) {
            System.out.println("Today is Saturday");
        }else{
            System.out.println("Today is Sunday");
        }
*/


        System.out.println("==============================================");

int age1 =35;
if(age1<21){
    System.out.println("Teenager");
}else if(age1>=21&&age1<=55){
    System.out.println("Adult");
}else {
    System.out.println("Senior");
}//cant be switch ==>boolean

        System.out.println("=============================================");

//nested if: faster,  no curly braces are needed
      int AGE=-2;
if(AGE>=1&&AGE<=150){
    if(AGE<21){
        System.out.println("Teenager");
    }else if(AGE>=21&&age1<=55){
        System.out.println("Adult");
    }else {
        System.out.println("Senior");

    }
}else{
    System.out.println("Invalid Age");
}

//String str=(AGE>=1&&AGE<=150)?(AGE>21)?

//....











    }
}
