package day23_NestedLoop;

import java.util.Scanner;

public class FirstUpperLastLower {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
       // String str="Cybertek";
scan.close();
        char f=str.charAt(0);
        char l=str.charAt(str.length()-1);
      //  boolean start=f>='A'&&f<='Z';//true
                        //65,90 same result
        //boolean end=l>='a'&&l<='z';//true
                      //97,122
        boolean isValid=f>='A'&&f<='Z'&&l>='a'&&l<='z';
        if (isValid){//true&&true==>true
            System.out.println("True");
        }else{
            System.out.println("False");
        }






    }
}
