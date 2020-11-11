package day17_Strings;
import java.lang.String;//unnecessary==this package is always imported automatically
public class String_Memory {
    public static void main(String[] args) {

        /*
                         String pool:
      strOne---->          "java"           <----------StrTwo
                           "Java"           <----------strFive

Heap: "java"  <------strThree
              <-------strFour
         */


     String strOne="java";//literal
     String strTwo="java";//literal
        String strThree=new String("java");
        String strFour=new String("java");
        System.out.println(strOne==strTwo);//it comparing objects so true
        System.out.println(strOne==strThree);//false
        System.out.println(strThree==strFour);//false

String strFive="Java";//made in the string pool
        System.out.println(strOne==strFive);//false

    }
}
