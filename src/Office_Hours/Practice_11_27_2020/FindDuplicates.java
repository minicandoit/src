package Office_Hours.Practice_11_27_2020;

import java.util.ArrayList;

public class FindDuplicates {
    public static void main(String[] args) {
        char[]chars={'A','A','B','C','C','D','A'};//[A,A,C,C,A]
        ArrayList<Character>duplicatedElementsList=new ArrayList<>();
       for(int i=0;i<= chars.length-1;i++) {
           int count = 0;
           for (char each : chars) {//respnosible for finding freequency of one element at a time
               if (each == chars[i]) {
                   count++;
               }
           }
           if(count>1){//responsible to verify if the element is duplicated
               duplicatedElementsList.add(chars[i]);
               //&&!duplicatedElementsList.contains(chars[i]

           }
       }

        System.out.println(duplicatedElementsList);

    }
}
