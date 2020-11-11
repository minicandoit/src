package day27_ForEachLoop;

public class FrequencyOfChar {
    public static void main(String[] args) {

       String str = "aabbbaa";
       String result="";

        char []StringToChar=str.toCharArray();
       for(char each1: StringToChar){

           int frequency=0;
           for(char each:StringToChar){

               if(each==each1){
                   frequency++;

               }
           }
        if(frequency>=1&&!result.contains(""+each1)){
            result+=each1+""+frequency;
        }

       }
        System.out.println(result);




    }
}
/*
 4. frequency of characters
            MUST apply for each loop
            str = "aabbbaa";
            output:
                a4b3

 */