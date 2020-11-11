package day22_javaRecap;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {

String str="Today I learned Java Language";
char ch=' ';
int count=0;
for(int i=0;i<=str.length()-1;i++){
    char eachChar=str.charAt(i);//represents each character from the String
if(ch==eachChar){
    count++;
}
}
        System.out.println("count = "+count);
        System.out.println("number of words: "+(count+1));











    }
}
