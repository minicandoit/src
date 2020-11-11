package day25_ArrayIntro;

public class RemoveUniqueCharacter {
    public static void main(String[] args) {

        String str = "abcabd";
        String result = "";   // abab
        //ab


//abab

        for(int j=0;j<str.length();j++) {
            char ch = str.charAt(j);//abcabd
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachCharacter = str.charAt(i);
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (count > 1) {//&&!result.contains(""+ch)
                result += ch;
            }

        }

        System.out.println("result: "+result);







    }
}
