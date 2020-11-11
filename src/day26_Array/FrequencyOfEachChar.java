package day26_Array;

public class FrequencyOfEachChar {
    public static void main(String[] args) {

      String str="aaabbc";//"a3b2c1"
        //step 1 : remove duplicates
       String nonDup="" ;                 //  a b c
        for(int i=0;i<str.length();i++){//i:0,1,2,3,4,5
            char eachChar=  str.charAt(i);//a,a,a,b,b,c
            if(!nonDup.contains(""+eachChar)){//contain only accepts string
                nonDup+=eachChar;             //char eachChar= ""+ str.charAt(i);
            }

        }
        System.out.println(nonDup);//abc
        String result="";

        //step2: find the frequency of each nondup characters from the original string
        for(int j=0;j<nonDup.length();j++){//j=index number of nondup
            char ch=nonDup.charAt(j);//a,b,c
            int count =0;//to contain frequency of char ch
            for(int i=0;i<str.length();i++){//i=index number of original string
                char eachChar=str.charAt(i);//a,a,a,b,b,c
                if(ch==eachChar){
                    count++;
                }
            }
            //  System.out.print(ch);
            //System.out.print(count);

            result+=""+ch+count;
//        'a'+3    ==>97+3=100 ,with out " "+
//         ""+'a'   +3  ==>a3      number



        }

        System.out.println(result);


    }
}
/*
Warmup tasks:
    1. write a program that can return the frequency of characters from a String
            Ex:
                str = "ababaac";
                output:
                    a3b2c1

 */