package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {


        int[]arr1={1,2};
        //         0 1
        int[]arr2={3,4,5,6,7};
        //         0 1 2 3 4
        int[]arr3={8,9,10,11,12,13};
        //         0 1  2  3  4  5

        int[][]arrays={arr1,arr2,arr3};
        //             0     1     2
        // retrieve the element:6
        System.out.println(arrays[1][3]);//6
        //retrieve the element:8
        System.out.println(arrays[2][0]);//8

        //retrieve the elements: {3,4,5,6,7}
        System.out.println(Arrays.toString(arrays[1]));
        //1D array===arrays[1]has to be converted to string
        //print entire arrays
       // System.out.println(Arrays.toString(arrays));//arrays==>2 dimensional arrays
        System.out.println(Arrays.deepToString(arrays));//for multi-dimensional

        System.out.println("====================================");
        String[][] batch21={
                           {"sam","luna"},//0
                           {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat"} ,           //1
                           {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"}
                          };           //2

        for(int i=0;i< batch21.length;i++){//i==each index num of the array each group
                   //i:index num of 1D arrays
            String []eachGroup =batch21[i];
            System.out.println(Arrays.deepToString(batch21[i]));
            for(int j=0;j<eachGroup.length;j++){//j==each member
                //j: index num of elements of each 1D arrays
                System.out.println(eachGroup[j]);
                //System.out.println(batch21[i][j]);
            }
        }

        System.out.println("=============================================");
/*

        for(int i=0;i< batch21.length;i++){//i==each index num of the array each group
            //i:index num of 1D arrays
            String []eachGroup =batch21[i];
            System.out.println(Arrays.deepToString(batch21[i]));
            for(int j=eachGroup.length-1;j>=0;j--){//j==each member
                String eachMember=eachGroup[j];

                //j: index num of elements of each 1D arrays
                System.out.println(eachMember);
                //System.out.println(batch21[i][j]);
                for(int k=eachMember.length()-1;k>=0;k--){


                }

                }
            }
*/
for(int i= batch21.length-1;i>=0;i--){//i: 2,1,0 represents the index num of 1D arrays
    for(int j=batch21[i].length-1;j>=0;j--){//j represents the index num of elements
        System.out.print(batch21[i][j]);
    }
}








    }
}
