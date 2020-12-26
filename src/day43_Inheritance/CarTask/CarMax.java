package day43_Inheritance.CarTask;

public class CarMax {//has a

    public static void main(String[] args) {
        Toyota toyota =new Toyota("camry", "white", "Japan", 2020, 1, 30000);

    BMW bmw=new BMW("X5","Red",2020,1,23000000);

        System.out.println(toyota);
        System.out.println(bmw);
     //   System.out.println(BMW.isMortal);

        System.out.println(BMW.isExpensive);
        System.out.println(BMW.isLuxury);

      //  System.out.println(Toyota.isLuxury);
      //  System.out.println(Toyota.isExpencive);

        System.out.println(Toyota.isAfordable);
        System.out.println(Toyota.isImmortal);
    }
}
