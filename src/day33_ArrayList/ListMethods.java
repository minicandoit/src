package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(200);
        list1.add(300);

        list1.set(1,400);//size is not changed
        System.out.println(list1);


        ArrayList<String>names=new ArrayList<>();
        names.add("Yalcin");
        names.add("mini");
        names.add("momo");
        names.add("momo");
        names.add("Chris");
        names.add("koko");
        names.add("kiki");
        names.add("kiki");
        names.add("Julia");

        System.out.println(names);
        names.set(3,"holy");
        names.set(6,"Spirit");
        System.out.println(names);

        int[]arr={10,20,30,40};
        arr[1]=200;

         //remove index number
        ArrayList<Character>list=new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        System.out.println(list);
        
        list.remove(2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);


//remove (object)
        ArrayList<Character>list2=new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        Character ch='C';//autoboxing
        //list2.remove('C');
//index:67==>C from aski table, size:5 index out of bounds
       // list2.remove(ch);
       boolean r1=list2.remove(Character.valueOf('C'));
        System.out.println(list2);
        System.out.println(r1);




        





    }
}
