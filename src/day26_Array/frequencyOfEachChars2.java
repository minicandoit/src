package day26_Array;

public class frequencyOfEachChars2 {
    public static void main(String[] args) {

     String str="aaabbc";
     //str=str.replace(" ",""); // if we need to ignore the spaces
        String expectedResult="";//"a3b2c1"

for(int j=0;j<str.length();j++) {
    char ch = str.charAt(j);//a,a,a,b,b,c
    int count = 0;
    for (int i = 0; i < str.length(); i++) {//i represents the index num of str
        char eachChar = str.charAt(i);
        if (eachChar == ch) {
            count++;
        }
    }

if(expectedResult.contains(""+ch)){
    continue;//skip
}else {
    expectedResult += "" + ch + count;//with out "" print out number
    //System.out.println(ch);
    // System.out.println(count);
}
}
        System.out.println(expectedResult);

    }
}
