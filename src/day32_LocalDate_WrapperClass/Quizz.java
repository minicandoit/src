package day32_LocalDate_WrapperClass;

import java.util.Arrays;

public class Quizz {
    public static void main(String[] args) {
        char[] arr={'A','B','C','D'};
        for(char each:arr){
            System.out.println(each+" ");
            if(each=='D'){
                continue;
            }

        }

        System.out.println("===============================");
        int[] num1=new int[3];
        System.out.println(Arrays.toString(num1));//[0,0,0]
        int[] num2={1,2,3,4,5};
        num1=num2;
        System.out.println(Arrays.toString(num1));//[1,2,3,4,5]
        for(int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
        }





    }
}
