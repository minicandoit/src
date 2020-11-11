package day18_String;

public class InitialOfTheUser {
    public static void main(String[] args) {

String c="cybertek";
String s="school";


        c=c.substring(0,1).toUpperCase();
        s=s.substring(0,1).toUpperCase();
        String initial=c.charAt(0)+"."+s.charAt(0);
        System.out.println(initial);


    }
}
