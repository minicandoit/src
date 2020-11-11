package day26_Array;

public class maximumNumberInArray {
    public static void main(String[] args) {
      int[] numbers={100,2,3,4,5,6,7};
      //             0 1 2 3 4 5 6
      int max=numbers[0];//compare index[0] to the rest of numbers
//    int max=-2147483648==>previous is easier=>int max=numbers[0];
        for(int i=1;i<=numbers.length-1;i++){//if the first is not max
            if(numbers[i]>max){          //int i=0;
                max=numbers[i];
            }
        }

        System.out.println("max ="+max);










    }



}
