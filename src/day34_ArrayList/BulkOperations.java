package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //contains all
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        boolean r1=list.contains(10);
        System.out.println(r1);//true

        //verify 10,30,50,&60 all are contained in the list
        boolean r2=list.contains(10)&&list.contains(30)&&list.contains(50)&&list.contains(60);
        System.out.println("r1 = "+r1);
        System.out.println("r2 = "+r2);


        //verify if 10,30,50,&&60 all are contained in the list
        boolean r3=list.containsAll(Arrays.asList(10,30,50,60));
        System.out.println(r3);

        ArrayList<String>group1=new ArrayList<>();
        group1.add("Mohamed");
        group1.add("Svetlana");
        group1.add("Ahmed");
        group1.add("Ercan");

        //Ahmed, Ercan,Biden

       boolean r5= group1.containsAll(Arrays.asList("Ahmed","Ercan","Biden"));
        //it's converted to collection type
        System.out.println("r5 ="+r5);

       boolean r6= group1.containsAll(Arrays.asList("Mohamed","Ahmed","Svetlana"));
        System.out.println("r6 = "+r6);

        System.out.println("==================================");
        //addAll()
        ArrayList<Character> chars =new ArrayList<>();//A,Z,C,B,H,I,K
        chars.addAll(Arrays.asList('A','Z','C','B','H','I','K'));
        System.out.println(chars);

        String[]names={"mini","mina","chris","Sue","ELi","Emre","mini","koko","kiki","momo"};
        ArrayList<String>students=new ArrayList<>();
      //  ArrayList<String>students=new ArrayList<>(Arrays.asList(names));

        students.addAll(Arrays.asList(names));//any non primitive can be converted to Array.asList
       //for primitive don't try to convert as list method
        System.out.println(students);

        ArrayList<Character>ch1=new ArrayList<>(Arrays.asList('A','B','C','D','E'));
ch1.addAll(Arrays.asList('J','K','L','M','N'));
        System.out.println(ch1);

        System.out.println("============================");

        ArrayList<String>group2=new ArrayList<>();
        group2.addAll(Arrays.asList(names));

        System.out.println(group2);
        /*
        group2.remove("mini");
        group2.remove("mina");
        group2.remove("kiki");
        group2.remove("momo");

         */

        group2.removeAll(Arrays.asList("mini","mina","kiki","momo"));//even duplicated one
        System.out.println(group2);

        System.out.println("===========================");

        ArrayList<String>employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed","Ahmed","Ahmed","Ahmed","Adil","Afooza"));
      /*
        for(int i=0;i<=employees.size()-1;i++){
            if(employees.get(i).equals("Ahmed")){
                employees.remove(i);//without the interface iterable , remove method can't be used in loop
            }
        }




        System.out.println(employees);//[Ahmed, Ahmed, Adil, Afooza]

       */

        employees.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employees);

        //retainAll
        ArrayList<String>employees2=new ArrayList<>();



    }
}
