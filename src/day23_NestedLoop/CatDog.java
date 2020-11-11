package day23_NestedLoop;

public class CatDog {
    public static void main(String[] args) {

        String sentence="dog dog Dog Dog cat CAT cAt CAt";
        String temp=sentence.toLowerCase();
        //after this we do not need to worry case sensitivity
        int countDog=0;
         String word="dog";// you can reassign ==same result
       while (temp.contains("dog")){
           temp=temp.replaceFirst("dog","");
       countDog++;
       }
        System.out.println("Number of dog: "+countDog);


       int countCat=0;
       word="cat";
       while(temp.contains("cat")){
           temp=temp.replaceFirst("cat","");
           countCat++;
       }
        System.out.println("Number of cat: "+countCat);
       //  String word1="dog"; you can reassign ==same result

        System.out.println(countCat==countDog);










    }
}
