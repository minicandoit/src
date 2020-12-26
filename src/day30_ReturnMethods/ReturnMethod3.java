package day30_ReturnMethods;

import java.util.Arrays;

public class ReturnMethod3 {

    public static void main(String[] args) {
int[]array={1,2,3,4,5,6,7,8,9};
int max=max(array);
int max2=max2(array);
int min=min(array);//min=variable name ,min=method name so can use at the same time
        System.out.println("max= "+max);
        System.out.println("max= "+max2);
        System.out.println("min= "+min);

        System.out.println(max>100);//false
//                          9
        System.out.println(min<-2);


    }
    public static int max(int[]arr){
      int max=arr[0];
     for(int each:arr){
         if(each>max){
             max=each;
         }
     }
        return max;//closing statement of this method
        //after print statement can't be

    }//mendatory to return your data

    public static int max2(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1];//max will be the last index of array
    }

    public static int min(int[]arr){
        int min=arr[0];
       for(int each:arr){
           if(each<min){
               min=each;
           }
       }
       return min;
    }











}
