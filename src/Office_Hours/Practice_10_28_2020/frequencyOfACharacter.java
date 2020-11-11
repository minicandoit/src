package Office_Hours.Practice_10_28_2020;

public class frequencyOfACharacter {
    public static void main(String[] args) {

        String str="abababa";//4 a
       //"bababa"
        //"bbaba"
        //"bbba"
        //"bbb" removed 4 times,frequency is 4

        char ch='a';
       //string ch=str.contains(ch)
        int count =0;

        while(str.contains(""+ch)) {//contains does not take char so add""
            str = str.replaceFirst(""+ch, "");
            count++;

        }

        System.out.println(count);

    }
}
