package day23_NestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java is a programming language, I like to learn Java Java Java Java Java";
        String word = "Java";
        int count=0;
        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;//we need to remove one at a time for count frequency
            //remove the "Java" using replace==if you do replace method
            //all java will be replaced
            //" is a programming language, I like to learn Java"
            //" is a programming language, I like to learn "
            //loop stops executing
        }

        System.out.println(count);
        System.out.println(sentence);










    }
}
/*
Warmup task:
    1. write a program that can return the frequncy of the a word from the sentence
        Ex:
            sentence = "Java is a programming language, I like to learn Java";
            word = "Java";
            output:
                2
    2.  Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
 */