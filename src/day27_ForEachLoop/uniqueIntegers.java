package day27_ForEachLoop;

public class uniqueIntegers {
    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4};
        //          0 1 2 3 4 5


        for(int j=0;j< arr.length;j++) {
            int element = arr[j];// 1//first element of Array
            int frequency = 0;//frequency of element
            for (int i = 0; i < arr.length; i++) {//i:0 1 2 3 4 5
                if (arr[i] == element) {//arr[i]=each element of array
                    frequency++;
                }
            }//finding the frequency of one element,by comparing it with each elements of array
            if(frequency==1){//if(frequency!=1)==>duplicate
                System.out.print(element+" ");
            }


        }













    }
}
/*
1. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4

 */