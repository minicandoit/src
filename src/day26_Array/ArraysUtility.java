package day26_Array;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {

int[] numbers={1,2,3,4,5,6};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(numbers);//hashcode
        System.out.println(Arrays.toString(numbers));//compiler cannot read array right away

        String str1="cybertek";
        System.out.println(str1);//only one element

        String[]classMates={"Adil","Muhammad","Yasin","Necdet","Daniel"};
        //array have multiple element
        System.out.println(classMates);//hashcode
        System.out.println(Arrays.toString(classMates));
        //System.out.println(Arrays.toString(classMates).replace("[","{").replace("]","}");

//sort (array)
        int[] arr1={200000,1000000,4000000,6000,300000,12345551,90000};
        Arrays.sort(arr1);//does not return any value,cannot be assigned to a variable nor pass it into print statement
        System.out.println(Arrays.toString(arr1));
        System.out.println("Max: "+arr1[arr1.length-1]);//the last index number=max
        System.out.println("Min: "+arr1[0]);//index number 0=>minimum number

        double[] arr2={1.5,0.5,2.5,0,3.5,1.8,10.5,20.5,-0.75,-0.5};
        Arrays.sort(arr2);
        System.out.println(arr2);//hashcode
        System.out.println(Arrays.toString(arr2));
        System.out.println("Second minimum number: "+arr2[1]);
        System.out.println("Second maximum number: "+arr2[arr2.length-2]);
                                                  //arr2[arr2.length-1-1])




String[]names={"me","Julia","sam","Dan","nana","eli"};
Arrays.sort(names);
        System.out.println(Arrays.toString(names));

      //equals(arr1,arr2)
      int[]a1={1,2,3};
      int[]a2={1,3,2};//compare index by index  ==>false

        Arrays.sort(a1);//[1,2,3]
        Arrays.sort(a2);//[1,2,3]

      boolean r1=Arrays.equals(a1,a2);
        System.out.println(r1);//true









    }
}
