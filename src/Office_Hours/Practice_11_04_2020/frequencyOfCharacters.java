package Office_Hours.Practice_11_04_2020;

public class frequencyOfCharacters {
    public static void main(String[] args) {


        String str = "abbacaa";//a4b2c1
        String result="";//one time only at the end==one result


        for(int j=0;j<str.length();j++) {
            char ch = str.charAt(j);//if you want to find second cha change the index number
            //a b c
            int count = 0;//for the frequency===//4 2 1

            for (int i = 0; i < str.length(); i++) {//to find frequency of one character
                //by comparing it with each characters of str
                if (ch == str.charAt(i)) {
                    count++;
                }

            }
            if(result.contains(ch+"")) {//contain contains only string
                continue;//if char is already is in the result we don't need to concate it


            }
                result += "" + ch + count;//when apply to ch to int convert ch to string


        }

        System.out.println(result);
    }
}