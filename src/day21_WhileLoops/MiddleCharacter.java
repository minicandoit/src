package day21_WhileLoops;

public class MiddleCharacter {
    public static void main(String[] args) {

        String word="ba";//1=3/2
        //"javav"//2=5/2

       if(word.length()%2!=0) {

           if (word.length() >= 3) {//if it has 3 or more character
               System.out.println(word.charAt(word.length() / 2));
           }else if (word.length() == 1) {
               System.out.println(word + word + word);
           }

       }else{//"java"==>av==>1,2
           //"apple"==>pl==>2,3
         if(word.length()>=4){//more than 4 chars
             int m=word.length()/2;//2
             System.out.println(word.charAt(m-1)+""+word.charAt(m));
         }//without "" returns as number
           else{//2 chars
             System.out.println(word+word+word);
         }



       }
















    }
}
