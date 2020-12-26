package day31_MethodOverLoading;

public class methodOverLoading3 {

    public static void main(String[] args) {
        double[]arr={1.5,2.5,3.5,0,0.5,1};//int also can be added
        System.out.println(max(arr));

        System.out.println(min(arr));


    }





    //returns the maximum number from an array of integer
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


   public static double max(double[] arr){
       double max=arr[0];
       for(double each:arr){
           if(each>max){
               max=each;
           }
       }
       return max;//closing statement of this method
       //after print statement can't be

   }





    //returns the minmum number from an array of integer
    public static int min(int[]arr){
        int min=arr[0];
        for(int each:arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static double min(double[]arr){
        double min=arr[0];
        for(double each:arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

}
