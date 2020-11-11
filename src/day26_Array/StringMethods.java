package day26_Array;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str="abcde";
      char[]array  =str.toCharArray();

        System.out.println(Arrays.toString(array));

        System.out.println("=====================================");
        //anagram task:
        String s1="acb";//a,c,b
        String s2="bac";//b,a,c

      char[] ch1  =s1.toCharArray();//[a,c,b]
      char[] ch2=   s2.toCharArray();//[b,a,c]
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram= Arrays.equals(ch1,ch2);//build out of same characters
        System.out.println(isAnagram);

//if acb,def==>false

        //split

        String sentence="Today is great day";
        String[] words=sentence.split(" ");//returns you String Array

        System.out.println(Arrays.toString(words));














    }
}
