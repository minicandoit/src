package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();

        names.add("Katy");
        names.add("Amir");
        names.add("Nadira");
        names.add("Erjon");
        names.add("Amir");
        names.add("Aibek");
        names.add("Ilgar");
        names.add("Amir");
        names.add("Amir");


        System.out.println(names);
        names.remove(1);
        System.out.println(names);
        names.remove("Amir");//remove only the first matching one
        System.out.println(names);
        names.remove(names.size()-1);
        System.out.println(names);
        names.clear();
        System.out.println(names);//0 object


    }
}
