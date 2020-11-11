package day20_ForLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str="Mini Bae";
        //012       01234567
       String result=""; //eaB iniM ==not the same object
        for(int i=str.length()-1;i>=0;i--){//str.length()-1==>last character

            result+=str.charAt(i);//charAt(index)==>returns the character
            //from the string at the given index
        }
        System.out.println(result);










    }
}
/*

    5. write a program that can reverse any given string
            ex:
                input: abcd
                output: dcba
                input: Cybertek
                output: ketrebyC
    6. write a program that can verify if the user entered String is palindrome
            ex:
                input: Level
                output: Level is palindrome
                input: java
                output: java is not palindrome

 */