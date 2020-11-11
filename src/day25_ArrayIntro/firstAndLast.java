package day25_ArrayIntro;

import java.util.Scanner;

public class firstAndLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        word=word.substring(0,1)+word.substring(word.length()-1);
        System.out.println(word);


    }
}
