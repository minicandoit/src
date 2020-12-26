package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Character>chars=new ArrayList<>();
        chars.addAll(Arrays.asList('X','Z','Y','W','A'));
        System.out.println(chars);

        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<Integer>scores=new ArrayList<>();
        scores.addAll(Arrays.asList(70,80,60,70,50,65,75));

        Collections.sort(scores);
        System.out.println("minimum numbers: "+scores.get(0));
        System.out.println("Maximum numbers: "+scores.get(scores.size()-1));

        System.out.println(scores);

        Collections.swap(scores,2,3);//3,2 will be the same result
        System.out.println(scores);

        Collections.swap(scores,0,scores.size()-1);
        System.out.println(scores);

        Collections.swap(scores,scores.indexOf(60),scores.lastIndexOf(70));
        System.out.println(scores);

        Collections.replaceAll(scores,60,100);
        System.out.println(scores);
        System.out.println("=================================");

      ArrayList<Character>list=new ArrayList<>();
      list.addAll(Arrays.asList('A','A','A','A','B','C','A','D','A','A','A','A'));
     /*
      for(int i=0; i<=list.size()-1;i++){
          char each=list.get(i);
          if(each=='A'){
              list.set(i,'E');
          }
      }

        System.out.println(list);

      */

      Collections.replaceAll(list,'A','E');
        System.out.println(list);

      int frequencyOfE=  Collections.frequency(list,'E');
        //only applicable to the collections type
        System.out.println("FrequencyOfE = "+frequencyOfE);


        System.out.println("================================");


        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(100,1000,20,200,2000,10));
        int max=Collections.max(nums);//unboxing
        int min=Collections.min(nums);

        System.out.println("max ="+max);
        System.out.println("min ="+min);














    }
}
