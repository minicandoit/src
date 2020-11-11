package day27_ForEachLoop;

public class uniqueIntegers2 {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4,1};

        //how many times 1 occured in the array

       for (int each2:arr) {
           int frequency = 0;//is the frequency of each2
           for (int each : arr) {
               if (each == each2) {//if each element equals to 1
                   frequency++;
               }
           }
           if(frequency==1){
               System.out.println(each2+" ");
           }


       }




    }
}
