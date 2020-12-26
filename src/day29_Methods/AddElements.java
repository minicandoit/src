package day29_Methods;

import java.util.Arrays;

public class AddElements {
    //{1,2,3},4
    public static void main(String[] args) {
        int[]arr={10,20,30,40};
      addElements(arr,50);
      int[]arr2={1,2,3,4,5,6,};
      addElements(arr2,10);

addArrays(arr,arr2);
    }



    public static void addElements(int[] arr,int num){
        int[]result=new int [arr.length+1];
        for(int i=0;i<= arr.length-1;i++){
            result[i]=arr[i];
        }
        result[result.length-1]=num;
        System.out.println(Arrays.toString(result));
    }
    //int[] arr1={1,2,3,4};
   // int[]arr2={5,6,7,8};
    public static void addArrays(int[]arr1,int[]arr2){



            int[] result = new int[arr1.length + arr2.length];
            int i = 0;
            for (int each1 : arr1) {
                result[i] = each1;
                i++;
            }
            for (int each2 : arr2) {
                result[i] = each2;
                i++;
            }
            System.out.println(Arrays.toString(result));
        }


}
