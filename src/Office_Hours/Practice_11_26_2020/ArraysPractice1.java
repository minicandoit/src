package Office_Hours.Practice_11_26_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        //array is fixed

    //    Integer[] arr=new Integer[5];//[null, null, null, null, null]
          int[]arr=new int[5];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]
        arr[0]=30;
        arr[3]=25;
        arr[4]=15;      //one variable containing 5 datas
        arr[1]=50;

        System.out.println(Arrays.toString(arr));//[30, 50, 0, 25, 15]

        int[]numbers=new int[100];
        for(int i=0;i<=numbers.length-1;i++){
            numbers[i]=i+1;
            //      0=1
            //      1=2
            //      2=3
            //      ...
            //    99=100
        }
        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();

        for(int each:numbers){
            if(each%2==0){
                even.add(each);
            }else{
                odd.add(each);
            }
        }
        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);




    }
}
