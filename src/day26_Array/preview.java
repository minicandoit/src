package day26_Array;

import java.util.Scanner;

public class preview {
    public static void main(String[] args) {

        String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Programming"};
        String result="";
        int max= words[0].length();
        for(int i=0;i< words.length;i++){
            if(words[i].length()>max){
                result+=words[i]+" ";
            }
        }

        System.out.println(result);
    }
}





