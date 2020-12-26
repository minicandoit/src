package Office_Hours.Practice_12_09_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetOrder {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet();
        carpet1.customOrder(2,4,10,true);
        System.out.println(carpet1);

       // Carpet carpet2=new Carpet();
      //  Carpet carpet3=new Carpet();
       // Carpet carpet4=new Carpet();
       // Carpet carpet5=new Carpet();

        Carpet[]carpets=new Carpet[5];

       // carpet2.customOrder(3,4,true);
      //  carpet3.customOrder(4,4,true);
       // carpet4.customOrder(5,4,true);
       // carpet5.customOrder(6,4,true);

        for(int i=0;i<carpets.length;i++){
            Carpet carpet=new Carpet();
            carpet.customOrder(2,1,3,true);
            carpets[i]=carpet;
        }
        double total=0;

        for(Carpet each:carpets){
            total+=each.totalPriceOfCarpet;
            System.out.println("each total: "+each.totalPriceOfCarpet);
        }

        System.out.println("Total Price : "+total);

        System.out.println("======================");

        ArrayList<Carpet>persianCarpets=new ArrayList<>();
        ArrayList<Carpet>regularCarpets=new ArrayList<>();

        for(int i=1;i<=5;i++){
            Carpet persian=new Carpet();
            persian.customOrder(2,3,2,true);
            Carpet regular=new Carpet();
            regular.customOrder(2,3,2,false);
             persianCarpets.addAll(Arrays.asList(persian));
             regularCarpets.addAll(Arrays.asList(regular));
        }
        System.out.println("number of carpets: "+persianCarpets.size());
        System.out.println("number of carpets: "+regularCarpets.size());

        double sum=0;

        for(Carpet each:persianCarpets){
            sum+=each.totalPriceOfCarpet;
            System.out.println("each price:"+each.totalPriceOfCarpet);
        }
        System.out.println(sum);

        for(Carpet each:regularCarpets){
            sum+=each.totalPriceOfCarpet;
            System.out.println("each price:"+each.totalPriceOfCarpet);
        }
        System.out.println(sum);





    }
}
