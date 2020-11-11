package day27_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String[] group1 = {"Sara", "Jesicca", "Parker", "Dragisa", "Sladjan"};
        String[] group2 = {"Asel", "Rauf", "Ruzanna", "Jamila", "Sofia"};
        String[] group3 = {"Abdul", "Sacha", "Amin", "Salih", "Jessica"};
        String[] group4={"Justyna", "Adil","Ercan","Irina","Med"};
        String[] groups=new String[group1.length+group2.length+group3.length+group4.length];
        //initialize the size
        int i=0;
        for(String each:group1){
            groups[i++]=each;
        }
       // System.out.println(Arrays.toString(groups));
        for(String each: group2){
            groups[i++]=each;
        }
        for(String each: group3){
            groups[i++]=each;
        }
        for(String each: group4){
            groups[i++]=each;
        }



        System.out.println(Arrays.toString(groups));






    }
}
