package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        String str="aabaacddddefffffghhhhhhhi";
        ArrayList<Character>list=new ArrayList<>();

        for(char each:str.toCharArray())
            list.add(each);//getting each character from string and adding it to arraylist
        System.out.println(list);
        for(Character each:list){//frequency only applicable to collection type
           if (Collections.frequency(list,each)==1){
               System.out.print(each+" ");
           }
        }







    }
}
