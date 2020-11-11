package Office_Hours.Practice_10_28_2020;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="abaacaaaaaaaaaaaaaaaaaaaaaaaaa";
        char ch='a';

        int count=0;//3
        for(int i=0;i<str.length();i++){//i represents index number
            char eachChar=str.charAt(i);//a,b,a,a,c
            if(eachChar==ch){//a==a
                count++;
            }
        }
        System.out.println(count);
    }
}
