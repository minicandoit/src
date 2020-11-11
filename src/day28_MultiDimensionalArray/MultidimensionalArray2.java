package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MultidimensionalArray2 {
    public static void main(String[] args) {


        int[][] arr2D1={{1,2,3,},{4,5,6,7,8}};
        int [][] arr2D2={{10,20,30,},{40,50,60,70,80}};
        int [][]arr2D3={{100,200,300,400},{500,600,700}};

        int[][][] arr3D={arr2D1,arr2D2,arr2D3};

        System.out.println(Arrays.deepToString(arr3D));
        //[[10, 20, 30], [40, 50, 60, 70, 80]]
        System.out.println(Arrays.deepToString(arr3D[1]));
        //{500,600,700}
        System.out.println(Arrays.toString(arr3D[2][1]));
        //single dimensional==Arrays.toString
        //print 30
        System.out.println(arr3D[1][0][2]);

        int[][][][] arr4D= {arr3D,arr3D};//{{{}}};
        int[][][][][]arr5D={arr4D,arr4D};


    }
}
