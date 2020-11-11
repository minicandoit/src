package day13_SwitchStatement;

public class Task1 {
    public static void main(String[] args) {
       int n=8;
        String result="";
        if(n>=0&&n<=9){if(n==1){result="God";}
        else if(n==2){
            result="is";
        }else if(n==3){
            result="Love";
        }else if(n==4){
            result="and";
        }else if(n==5){
            result="He";
        }else if(n==6){
            result="gave";
        }else if(n==7){
            result="his";
        }else if(n==8){
            result="own";
        }else{
            result="son";
        }

        }else{
            result="Invalid";
        }
        System.out.println(result);

        /*
         1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
            Note: MUST USE NESTED IF

         */
    }
}
