package day25_ArrayIntro;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[]month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        //              0      1    2     3     4      5     6     7
        System.out.println("Enter the number");
        int num= scan.nextInt();//1
        System.out.println(month[num-1]);  //may index==4----->5-1
        //more than index number will be exception











    }
}
