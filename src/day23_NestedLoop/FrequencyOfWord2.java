package day23_NestedLoop;

public class FrequencyOfWord2 {
    //without case sensitivity
    public static void main(String[] args) {
        String sentence="Java Java java java";
        String word="Java";
        word=word.toLowerCase();

        String temp=sentence.toLowerCase();//"java java java java"
        int count=0;
        while (temp.contains(word)){//if you use replace you will remove all
            //java at the same time ,can't count
           temp= temp.replaceFirst(word,"");
            count++;
        }

        System.out.println(count);








    }
}
