package day25_ArrayIntro;

import java.util.Scanner;

public class myFriend {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many friends?");
        int number =scan.nextInt();

        String[] firstName=new String[number];
        String[] lastName=new String[number];//same exact index number
/*
String[]firstName=new String[5];
String []lastName=new String[5];
       firstName  [0]="Agalar";//you need to store string only
       firstName [1]="Mohamed";
       firstName[2]="Afrooz";
       firstName[3]="Dargisa";
       firstName[4]="Elvira";

       lastName[0]="love";
        lastName[1]="love";
        lastName[2]="love";
        lastName[3]="love";
        lastName[4]="love";

for(int i=0;i<5;i++){
    System.out.println(firstName[i]+" "+lastName[i]);
}



*/

        for(int i=0;i<number;i++){//i:0,1,2,3....lastindex
            System.out.println("Enter first name: ");
           String f= scan.next();
           f=f.substring(0,1).toUpperCase()+f.substring(1);
           //giving the right format for the firstname
           firstName[i]=f;


            System.out.println("Enter last name: ");//depends on the size of array
            String l=scan.next();
            l=l.substring(0,1)+l.substring(1);//first cha==uppper,rest of==lower
            //can't call uppercase from char
            lastName[i]=l;


            System.out.println("==================================");
        }//the loop is used for initializing the arrays
scan.close();
        for (int i=0;i<number;i++){//used for printing out the elements in the array
            System.out.println(firstName[i]+" "+lastName[i]);
        }






    }
}
/*
how many friends you have?5,4,3......

String[] firstName=new String[5];
String[] lastName=new String[5];


fullName
 */