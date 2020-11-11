package Office_Hours.Practice_11_04_2020;

public class uniqueAndDuplicate {
    public static void main(String[] args) {

        String str="aabccd";
        String unique=""; // "bd"
        String duplicates="";//"aacc"
        //char ch = str.charAt(0);//first character of str=='a'
//before put in the for loop
        for(int j=0;j<str.length();j++) {//******outer loop******
            char ch = str.charAt(j);//first character of str=='a'
            int frequency = 0;//to contain ch in str====frequency of char variable
            //for finding the frequency of one character at a time
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;

                }
            }
            if (frequency == 1) {//if frequency is 1, it means the ch is unique
                unique += ch;
            }
           // if(frequency>1){//if frequency is more than 1, it means the ch is duplicated
          //     duplicates+=ch;
          //  }

if(frequency>1&&!duplicates.contains(ch+"")){
   duplicates+=ch;//in order to contain one char
}

        }

        System.out.println(unique);
        System.out.println(duplicates);




    }
}
