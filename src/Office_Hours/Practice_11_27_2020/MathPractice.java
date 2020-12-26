package Office_Hours.Practice_11_27_2020;


import java.text.DecimalFormat;

public class MathPractice {
    public static void main(String[] args) {
     double n1 =  Math.pow(2,3);//power
        System.out.println(n1);

       double n2= Math.pow(10,2);
        System.out.println(n2);

       int n3= Math.max(100,200);
        System.out.println(n3);

        int n4=Math.min(100,200);
        System.out.println(n4);

        int[]numbers={1,2,3,4,5,6,7,8,9};
        int max=numbers[0];
        int min=numbers[0];

        for(int each:numbers){
           max= Math.max(each,max);
            min=Math.min(each,min);
        }

        System.out.println("Min = "+min);
        System.out.println("Max = "+max);

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double n5=Math.sqrt(100);//square root of 100
        System.out.println(n5);//10

        DecimalFormat df=new DecimalFormat("0.00");
       double r1=calculateAreaOfCircle(3);
        System.out.println(r1);
        System.out.println(df.format(r1));

        System.out.println(df.format(2.98777777));

        int num1=100;
        int r2=Integer.parseInt((""+num1).substring(0,2));
        //converting string to primitives//or can use valuse of method==string to wrapper class
        System.out.println(r2);





        }

    public static double calculateAreaOfCircle (double r) {
        return Math.PI * Math.pow(r, 2);
    }



    }

