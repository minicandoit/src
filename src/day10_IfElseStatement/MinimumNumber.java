package day10_IfElseStatement;

public class MinimumNumber {
    public static void main(String[] args) {
// assume they are three different numbers
        int n1=200;
        int n2=100;
        int n3=300;

        boolean n3Ismin=n3<n1&&n3<n2;//if n3 is less than both  n1 and n2, it means that n3 is the minimum
        boolean n2Ismin=!n3Ismin&&n2<n1;//if n3 is not minimum ans n2 is less than n1, it means n2 is the minimum
       //n2<n1&&n2<n3;
        boolean n1Ismin=!n3Ismin&&n2Ismin;//if n3 is not minimum and n2 is not the minimum then n1 is minimum
   //n1<n3&&n1<n2;


    String str= " is minimum number";
    int min=0;

    if (n3Ismin) {
        //System.out.println(n3+str);
        //if(n3<n1&&n3<n2)==>same
        min=n3;//we are not just finding minimum number but also making it to be reusable
    }
    if(n2Ismin){
        //System.out.println(n2+str);
        min=n2;
    }
    if(n3Ismin){
       // System.out.println(n1+str);
        min=n1;
    }

        System.out.println(min+str);




    }







}
