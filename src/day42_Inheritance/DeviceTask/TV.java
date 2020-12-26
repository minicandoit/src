package day42_Inheritance.DeviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price) {
setInfo("TV",brand,model,price);
    }//if you already know device name put it directly
   public static boolean hasChannel,hasCable;

   static {
       hasChannel=true;
       hasCable=true;

   }
   public void channelUp(){
       System.out.println("channer up "+brand+"model");
   }
    public void channelDown(){
        System.out.println("channer down "+brand+"model");
    }


}
