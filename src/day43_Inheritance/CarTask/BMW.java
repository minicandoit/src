package day43_Inheritance.CarTask;

public class BMW  extends Car{

    public BMW( String model, String color, int year, int miles, double price) {
   setInfo("BMW", model, color, "Germany", year,  miles, price);
    }
    public static boolean isExpensive,isLuxury,breaksALot;

    static {
        isExpensive=true;
        isLuxury=true;
        breaksALot=true;
    }

    public void race(){
        System.out.println(brand+" "+model+" is racing");
    }
}
