package day28_MultiDimensionalArray;

public class TwoDImensionalArrays2 {
    public static void main(String[] args) {


        //             0 1 2 3   0 1   0 1 2   0  1  2    0  1  2  3  4
        int[][]arr2D={{1,2,3,4},{5,600},{7,8,9},{10,11,12},{13,14,15,16,17}};
        // index         0        1      2          3       4==>length5

   int max=arr2D[0][0];
   int min=arr2D[0][0];

   for(int[] each1DArray:arr2D){
       for(int eachElements:each1DArray){

           if(eachElements>max)
               max=eachElements;//no bracket mandatory one if

           if(eachElements<min)
               min=eachElements;


       }
   }
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);




    }
}
