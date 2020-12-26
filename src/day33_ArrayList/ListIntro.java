package day33_ArrayList;
import java.util.ArrayList;
public class ListIntro {
    public static void main(String[] args) {

        ArrayList<Integer>  scores=new ArrayList<>();//if you want to give optional same exact data Type
//size:1==>index number==0
        scores.add(100);//0,converting primitives to wrapper class==>autoboxing
        scores.add(200);//1,size will be 2 ,autoboxing
        scores.add(300);//2

       // scores.add(-1,400);error ==>minimum index is 0
        //scores.add(4,400);error next one should be index 3 0~3only //do not skip index

        scores.add(1,400);


        System.out.println(scores);
      //  System.out.println(scores.toString);same but don't need it implicively done

     ArrayList<String>groceryList=new ArrayList<>();//[Egg,water,milk,Bread}
        groceryList.add("Egg");//3
        groceryList.add("Water");//4
        groceryList.add("Milk");//5
        groceryList.add("Bread");//6


        groceryList.add(0,"Toilet Paper");//0
       // groceryList.add("sanitizer"); add at the last
        groceryList.add(1,"Sanitizer");//2
        groceryList.add(1,"N95 Mask");//1
        

        System.out.println(groceryList);






    }
}
