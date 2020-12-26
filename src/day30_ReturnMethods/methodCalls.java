package day30_ReturnMethods;
import library.*;//packagename stringutility
import library.ArraysUtility;

import java.util.Arrays;

public class methodCalls {

    public static void main(String[] args) {
        String str="Level";
      String reversedName=  StringUtility.reverse(str);
        System.out.println(str.equalsIgnoreCase(reversedName));

  String str2="aaaabbbbbbccccccddddddeeeeeee";
  String result=StringUtility.removeDuplicates(str2);
        System.out.println(result);

        String str3="aabccdeee";
      String result3=  StringUtility.unique(str3);
        System.out.println(result3);
        System.out.println("=================================");
        int[]array={1,0,-2,30,40,500,-20,-50};
        int[] descending=ArraysUtility.sort(array);
        System.out.println(Arrays.toString(descending));
        System.out.println(ArraysUtility.printArray(descending));
        System.out.println("================================");
        String s1="ccccccccccccccbbbbbbbbbbbbbbaaaaaaaaa";
        String s2="bbbbbbbbbbbbaaaaaaaaaaaaac";
       boolean r1= StringUtility.isAnagram(s1,s2);





    }

}
