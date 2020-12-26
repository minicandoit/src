package library;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {
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


   //returns the maximum number from an array of double
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

    //returns the minimum number from an array of double
    public static double min(double[]arr) {
        double min = arr[0];
        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    //combines two arrays of integers and return the new array
    public static int[] combineTwoArrays(int []arr1,int[]arr2){
        int []arr3=new int[arr1.length+ arr2.length];
        int i=0;//represents the index nums of arr3
        for(int each:arr1){
            arr3[i++]=each;//each elements of arr1 is being assigned to the index of third array
        }
        //i=2
        for(int each:arr2){
            arr3[i++]=each;//each elements of arr2 is being assigned to the index of third array
        }
        Arrays.sort(arr3);

        return arr3;
    }



    //combines two arrays of doubles and return the new array
    public static double[] combineTwoArrays(double []arr1,double[]arr2){
        double []arr3=new double[arr1.length+ arr2.length];
        int i=0;//represents the index nums of arr3
        for(double each:arr1){
            arr3[i++]=each;//each elements of arr1 is being assigned to the index of third array
        }
        //i=2
        for(double each:arr2){
            arr3[i++]=each;//each elements of arr2 is being assigned to the index of third array
        }
        Arrays.sort(arr3);

        return arr3;
    }

    //combines two arrays of chars and return the new array
    public static char[] combineTwoArrays(char []arr1,char[]arr2){
        char []arr3=new char[arr1.length+ arr2.length];
        int i=0;//represents the index nums of arr3
        for(char each:arr1){
            arr3[i++]=each;//each elements of arr1 is being assigned to the index of third array
        }
        //i=2
        for(char each:arr2){
            arr3[i++]=each;//each elements of arr2 is being assigned to the index of third array
        }
        Arrays.sort(arr3);

        return arr3;
    }

    //combines two arrays of Strings and return the new array
    public static String[] combineTwoArrays(String []arr1,String[]arr2){
        String []arr3=new String[arr1.length+ arr2.length];
        int i=0;//represents the index nums of arr3
        for(String each:arr1){
            arr3[i++]=each;//each elements of arr1 is being assigned to the index of third array
        }
        //i=2
        for(String each:arr2){
            arr3[i++]=each;//each elements of arr2 is being assigned to the index of third array
        }
        Arrays.sort(arr3);

        return arr3;
    }



    //sorts the array of integers in decending order,and returns it as an array
    public static int[] sort(int[]arr){//{2,1,3}==>decending order
        Arrays.sort(arr);//{1,2,3}
    int[]reversedArray=new int[arr.length];//{0,0,0}==>{3,2,1}
    for(int i= arr.length-1,j=0;i>=0;i--,j++){
reversedArray[j]=arr[i];
    }
    return reversedArray;
}

    public static double[] sort(double[]arr){//{2,1,3}==>decending order
        Arrays.sort(arr);//{1,2,3}
        double[]reversedArray=new double[arr.length];//{0,0,0}==>{3,2,1}
        for(int i= arr.length-1,j=0;i>=0;i--,j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }

    public static char[] sort(char[]arr){//{2,1,3}==>decending order
        Arrays.sort(arr);//{1,2,3}
        char[]reversedArray=new char[arr.length];//{0,0,0}==>{3,2,1}
        for(int i= arr.length-1,j=0;i>=0;i--,j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }

    public static String[] sort(String[]arr){//{2,1,3}==>decending order
        Arrays.sort(arr);//{1,2,3}
        String[]reversedArray=new String[arr.length];//{0,0,0}==>{3,2,1}
        for(int i= arr.length-1,j=0;i>=0;i--,j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }



//replace the [ with{ while  printing the array
public static String printArray(int[]arr){
      String str=  Arrays.toString(arr);
      str=str.replace("[","{").replace("]","}");
return str;
    }

    //                              {1,2,3,4,5}    6
    //adds elements to the integer array
    public static int[] addElement(int[]array,int element){
        int[] result=new int[array.length+1];
        for(int i=0;i<= array.length-1;i++){
            result[i]=array[i];
        }
        result[result.length-1]=element;

        return result;

    }
    //adds elements to the double array
    public static double[] addElement(double[]array,double element){
        double[] result=new double[array.length+1];
        for(int i=0;i<= array.length-1;i++){
            result[i]=array[i];
        }
        result[result.length-1]=element;

        return result;

    }
    //adds elements to the char array
    public static char[] addElement(char[]array,char element){
        char[] result=new char[array.length+1];
        for(int i=0;i<= array.length-1;i++){
            result[i]=array[i];
        }
        result[result.length-1]=element;

        return result;

    }
   //adds elements to the string arry
    public static String[]addElement(String[]array,String element){
        String[] result=new String[array.length+1];
        for(int i=0;i<= array.length-1;i++){
            result[i]=array[i];
        }
        result[result.length-1]=element;

        return result;
    }
/*
reverse the array
 */
    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];
        for(int i = arr.length-1, j = 0 ;  i >= 0  ;  i--, j++  ){  //i: index numbers of arr in reversed order
            reverse[j] = arr[i] ;  // j: index numbers of reverse array, in natual morder
        }
        return reverse;
    }
    public static double[] reverse(double[] arr){
        double[] reverse = new double[arr.length];
        for(int i = arr.length-1, j = 0 ;  i >= 0  ;  i--, j++  ){  //i: index numbers of arr in reversed order
            reverse[j] = arr[i] ;  // j: index numbers of reverse array, in natual morder
        }
        return reverse;
    }
    public static char[] reverse(char[] arr){
        char[] reverse = new char[arr.length];
        for(int i = arr.length-1, j = 0 ;  i >= 0  ;  i--, j++  ){  //i: index numbers of arr in reversed order
            reverse[j] = arr[i] ;  // j: index numbers of reverse array, in natual morder
        }
        return reverse;
    }


    public static String[] reverse(String[] arr){
        String[] reverse = new String[arr.length];

        for(int i = arr.length-1, j = 0 ;  i >= 0  ;  i--, j++  ){  //i: index numbers of arr in reversed order
            reverse[j] = arr[i] ;  // j: index numbers of reverse array, in natual morder
        }
        return reverse;
    }

    /*
    removes the duplicates from an array of integers and returns it
     */
    public static int[] removeDuplicates(int[]arr){
        ArrayList<Integer> list=new ArrayList<>();//[1,2,3,4]

        for(int each:arr){
            if(list.contains(each)){
                continue;
            }
            list.add(each);
        }

        int[] nonDup=new int[list.size()];
        for(int i=0;i<= nonDup.length-1;i++){
            nonDup[i]= list.get(i);
        }
        return nonDup;

    }

    public static double[] removeDuplicates(double[]arr){
        ArrayList<Double>list=new ArrayList<>();//[1,2,3,4]

        for(double each:arr){
            if(list.contains(each)){
                continue;
            }
            list.add(each);
        }

        double[] nonDup=new double[list.size()];
        for(int i=0;i<= nonDup.length-1;i++){
            nonDup[i]= list.get(i);
        }
        return nonDup;

    }

    public static char[] removeDuplicates(char[]arr){
        ArrayList<Character>list=new ArrayList<>();//[1,2,3,4]

        for(char each:arr){
            if(list.contains(each)){
                continue;
            }
            list.add(each);
        }

        char[] nonDup=new char[list.size()];
        for(int i=0;i<= nonDup.length-1;i++){
            nonDup[i]= list.get(i);
        }
        return nonDup;

    }

    public static String[] removeDuplicates(String[]arr){
        ArrayList<String>list=new ArrayList<>();//[1,2,3,4]

        for(String each:arr){
            if(list.contains(each)){
                continue;
            }
            list.add(each);
        }

        String[] nonDup=new String[list.size()];
        for(int i=0;i<= nonDup.length-1;i++){
            nonDup[i]= list.get(i);
        }
        return nonDup;

    }

/*
find the unique elements from an array of String,integer,double,char  and returns it
 */
    public static String[] uniques(String[]arr){
        ArrayList<String> uniqueElementsList = new ArrayList<>();
        for (String element : arr) {
            int count = 0;
            for (String each : arr) {
                if (each==element) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElementsList.add(element);
            }
        }

        String[] uniques = new String[uniqueElementsList.size()];
        for(int i = 0; i <= uniques.length-1; i++){
            uniques[i]  = uniqueElementsList.get(i); // each element of the array list need to be assigned to each index of the array
        }

        return uniques;
    }

    public static int[] uniques(int[]arr){
        ArrayList<Integer> uniqueElementsList = new ArrayList<>();
        for (int element : arr) {
            int count = 0;
            for (int each : arr) {
                if (each==element) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElementsList.add(element);
            }
        }

        int[] uniques = new int[uniqueElementsList.size()];
        for(int i = 0; i <= uniques.length-1; i++){
            uniques[i]  = uniqueElementsList.get(i); // each element of the array list need to be assigned to each index of the array
        }

        return uniques;
    }

    public static double[] uniques(double[]arr){
        ArrayList<Double> uniqueElementsList = new ArrayList<>();
        for (double element : arr) {
            int count = 0;
            for (double each : arr) {
                if (each==element) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElementsList.add(element);
            }
        }

        double[] uniques = new double[uniqueElementsList.size()];
        for(int i = 0; i <= uniques.length-1; i++){
            uniques[i]  = uniqueElementsList.get(i); // each element of the array list need to be assigned to each index of the array
        }

        return uniques;
    }

    public static char[] uniques(char[]arr){
        ArrayList<Character> uniqueElementsList = new ArrayList<>();
        for (char element : arr) {
            int count = 0;
            for (char each : arr) {
                if (each==element) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElementsList.add(element);
            }
        }

        char[] uniques = new char[uniqueElementsList.size()];
        for(int i = 0; i <= uniques.length-1; i++){
            uniques[i]  = uniqueElementsList.get(i); // each element of the array list need to be assigned to each index of the array
        }

        return uniques;
    }







}
