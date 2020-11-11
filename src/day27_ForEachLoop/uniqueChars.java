package day27_ForEachLoop;

import java.util.Arrays;

public class uniqueChars {
    public static void main(String[] args) {

        String str="aabbcddeef";
        //String[]arr=str.split("");
       char[]arr=str.toCharArray();//more convenient using operator
//[a, a, b, b, c, d, d, e, e, f]
       // String []arr=str.split("");[a, a, b, b, c, d, d, e, e, f]

        System.out.println(Arrays.toString(arr));

        for (int j=0;j< arr.length;j++) {
           // String element=arr[j];


            char element = arr[j];
            int frequency = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==element)   {//if (arr[i].equals(element))
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.print(element+" ");
            }


        }





    }
}
