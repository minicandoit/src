package day19_ForLoop;


import java.util.Scanner;

public class CombineTwoString {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String s1=scan.next();      //"one";
        String s2= scan.next();       //"eight";
        scan.close();
        if(s1.charAt(s1.length()-1)==s2.charAt(0)){//if last character of firstString equals to first character of secondStirng
            System.out.println(s1+s2.substring(1));
            //                         from1 till the end
        }else
            System.out.println(s1+s2);

        System.out.println("==================================================");


        if(s1.endsWith(s2.substring(0,1))){//if first string ends with first character of second string
           //        ""+   s2.charAt(0) ==with "" will be taken as a string
            //without "" it makes error
            System.out.println(s1+s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }

        System.out.println("====================================================");














    }
}
