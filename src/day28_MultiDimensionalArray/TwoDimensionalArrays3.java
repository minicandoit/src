package day28_MultiDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalArrays3 {
    public static void main(String[] args) {


        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        for(int i= arr2D.length-1;i>=0;i--){//i: index of array
           for(int each:arr2D[i]){
               System.out.print(each+" ");//printing each elements in same line
           }//9 10 11 12 13 4 5 6 7 8 1 2 3
            System.out.println();//9 10 11 12 13
                                // 4 5 6 7 8
                                 //1 2 3

        }


/*
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        task1:
        9 10 11 12 13
        4 5 6 7 8
        1 2 3
        task2:
        3 2 1
        8 7 6 5 4
        13 12 11 10 9
        task3:
        13 12 11 10 9
        8 7 6 5 4
        3 2 1
*/


        System.out.println("====================");
        /*
        3 2 1
        8 7 6 5 4
        13 12 11 10 9
         */
        for(int[] each1DArray:arr2D){
            for(int i=each1DArray.length-1;i>=0;i--){
                System.out.print(each1DArray[i]+" ");
            }
            System.out.println();
        }

        System.out.println("=======================");
        for(int i=arr2D.length-1;i>=0;i--) {
            int[] arr1d = arr2D[i];
            /*
            [9, 10, 11, 12, 13]
            [4, 5, 6, 7, 8]
            [1, 2, 3]
*/


            for (int j = arr1d.length-1; j >= 0; j--) {
                System.out.print(arr1d[j]+" ");
            }
            System.out.println();
        }






        }







    }

