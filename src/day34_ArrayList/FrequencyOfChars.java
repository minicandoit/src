package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
String str="AAABBCDDDDEEE";
//A3B2C1D4E3
        String result="";
        ArrayList<String>list=new ArrayList<>();//in order to be able to use frequency method
        for(String each:str.split(""))//we get every character from str and add them into arrayList
            list.add(each);
        System.out.println(list);
        for(String each:list) {
            int frequency = Collections.frequency(list, each);

            if(!result.contains(each)) //to avoid duplicated characters in the result
            result+=each+frequency;
        }

        System.out.println(result);



    }
}
