package day08_Shorthand_Relational;

public class GallonsToLitter {
    public static void main(String[] args) {

        int gallons =100;

        /*
        double litters= gallons*3.785;
        int result =(int)litters;

        System.out.println(gallons+" gallons equal to "+result+" litters");
   */
         int litters= (int)(gallons*3.785);
        System.out.println(gallons+" gallons equal to "+ litters+" litters");

    }
}
