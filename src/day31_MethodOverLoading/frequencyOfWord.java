package day31_MethodOverLoading;

import library.StringUtility;

public class frequencyOfWord {
    public static void main(String[] args) {

        String str="Today is a great day, today we are learning java,today we have java class";
   int count=frequencyOfWord(str,"today");//integal data you can't assign to variable
//you can't printed out or you can't compare another integer
        System.out.println(count);

        String str2="java JAVA jAvA c#,c#,c# java java";
        int countJava=StringUtility.frequencyOfWord(str2,"java");
        int countDSharp=StringUtility.frequencyOfWord(str2,"c#");

        System.out.println("countJava = "+countJava);
        System.out.println("countCSharp = "+countDSharp);
        System.out.println("==============================");

        String sentence="dog dog dog Dog DOG dog cat cat cat CAT";
        int countDog=StringUtility.frequencyOfWord(sentence,"dog");
        int countCat=StringUtility.frequencyOfWord(sentence,"cat");
        System.out.println("countDog = "+countDog);
        System.out.println("countCat = "+countCat);
        System.out.println(countCat==countDog);



    }

    public static int frequencyOfWord(String sentence,String word){
       sentence=sentence.toLowerCase();
       word=word.toLowerCase();

        int frequency=0;

      while(sentence.contains(word)){//if==>only once so while is proper
         sentence=sentence.replaceFirst(word,"");
          frequency++;
      }


return frequency;
    }
}
/*
Task1:
        1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequencyOfWord(str, word) ==>  3

 */