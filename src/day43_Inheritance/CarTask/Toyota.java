package day43_Inheritance.CarTask;

public class Toyota extends Car{
   /*
  variable: brand,model,color,madeIn,year,miles,price
  methods: setInfo,drive, park, toString
  */


    public Toyota(String model, String color, String madeIn, int year, int miles, double price) {
   setInfo("Toyota",  model,  color, madeIn, year, miles, price);
    }

    public static boolean isAfordable, isImmortal;

    static {
        isAfordable =true;
        isImmortal = true;
    }




}
