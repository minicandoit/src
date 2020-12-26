package day29_Methods;

public class ReverseStirng {
   //"Cybertek"==>"ketrebyC
   public static void main(String[] args) {
       reverse("cybertek");
       System.out.println("============================");
       String[] names={"mini","jelly","inna","hannah","mariam","Elizabeth"};
       for(String each:names){
           reverse(each);
       }

   }

    public static void reverse(String word) {
        String result="";
        for(int i=word.length()-1;i>=0;i--){
           result+= word.charAt(i);
        }

        System.out.println(result);
    }





}
