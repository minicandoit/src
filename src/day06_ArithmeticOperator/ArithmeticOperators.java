package day06_ArithmeticOperator;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10/4);//2
        System.out.println("10/4");//10/4  --"10"treated as text

        System.out.println(12+3.0);//15.0
        System.out.println("12"+3);//123 =====concatenation
        System.out.println('a'+3);//addition, every single char has corresponding number
                          //97+3

        System.out.println(12.0-4);//8.0
        double a=12.0/3;//out put is double
        System.out.println(a);//4.0

       int b= 10/3;
        System.out.println(b);//3

      double c = 10/3;//3.0
                //c=3
               //3.0
       double d=10/3.0;
        //d=3.333333.....

        System.out.println(d);
        int x=   3/2;
        //x=1

        System.out.println(x);//1

        double y =3/2;  //1.0


        System.out.println(y);//1.0

        double z=3/2.0;//to get 1.5 either numerator or denominator should decimal
 //double z=3d/2;  or add f


        System.out.println("=========================");

        System.out.println(100%13);
        System.out.println(100%10);

        System.out.println(20%4.5);



    }

}
