package Office_Hours.Practice_11_27_2020;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*
        Str1=Listen
        str2=Silent
         */

        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toUpperCase();//LISTEN
        str2 = str2.toUpperCase();//SILENT

       str1=sort(str1);
       str2=sort(str2);

        System.out.println(str1.equals(str2));

        System.out.println("===========================");


        String s1="Listen";
        String s2="silent";

        s1=s1.toLowerCase() ;
        s2=s2.toLowerCase();

        String[] arr1=s1.split("");//[l,i,s,t,e,n]
        String[] arr2=s1.split("");//[s,i,l,e,n,t]

        Arrays.sort(arr1);
        Arrays.sort(arr2); //both arrays will be in the same order

        boolean isAnagram =Arrays.equals(arr1,arr2);
        System.out.println("isAnagram= "+isAnagram);



    }
    //                           "dcba"
    public static String sort(String str){ //{[d,c,b,a]
        String result="";
      char[]ch=  str.toCharArray();
        Arrays.sort(ch);//[a,b,c,d]
        for(char each:ch)
            result+=each;

        return result;

    }









    }

