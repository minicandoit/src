package day08_Shorthand_Relational;

public class ShortHandOperators {
    public static void main(String[] args) {

        //int a;//if you don't store the data no use
       int a=10;
        System.out.println(a);//10
       a=30;
       System.out.println(a);//30

        String schoolName="Cybertek";
        schoolName="MIT";//if you give data type like String again you cant use the same variable name
        System.out.println(schoolName);

        int x=100;
            x -= 62;//x=x-62;====>38
        System.out.println(x);

        double salary =100000;//0.28
               salary -=(salary*0.28);
               //salary-=28000
               //salary=salary-28000
               //salary = 100000-28000=72000
        System.out.println(salary);

        int x2=999999;
            x2-=25;
        System.out.println(x2);


  double balance = 2000;
         balance-= 450;
        System.out.println(balance);
        balance-=1000;
        System.out.println(balance);
       //depositing
        balance+=5000;
        System.out.println(balance);


        int y2=400;
        y2+=10000*0.1;
        //y2+=1000
        //y2=1400

      String name = "Cybertek";
      name +=" school";
      //name=name+"School";
        System.out.println(name);



        double totalTax=100000;
totalTax *=0.28; //totalTax=100000*0.28
        System.out.println(totalTax);


        int bonus=5000;
            bonus *=2+1;//bonus =5000*3
        System.out.println(bonus);

        int y3=10;
            y3 /= 5;
        System.out.println(y3);


        int house = 500000;
        int month=240;
//double monthlypayment=house/240;
        double monthlyPayment=500000;//house instead of 500000
               monthlyPayment/=240;//month

        System.out.println(monthlyPayment);

        //100/3;======>33.33333......
        int a2  =100;
            a2 %= 3;//a2=100%3;






























    }
}
