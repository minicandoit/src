package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

String []employeeNames={"Mini","Sam","Sara","Nana","Lulu"};
//                       0       1     2     3      4
int[]employeeSalary={100000,110000,105000,120000,115000};
//                    0       1       2      3      4

        int max=employeeSalary[0];
        String nameOfMax=employeeNames[0];

        int min=employeeSalary[0];
        String nameOfMin=employeeNames[0];
/*
John:100000
.........
Who has the highest salary
who has the minimum salary
 */
for(int i=0;i<=employeeNames.length-1;i++) {
//for each loop one array at a time so can't use here
    System.out.println(employeeNames[i]+" : $"+employeeSalary[i]);

   if(employeeSalary[i]>max){
       max=employeeSalary[i];
       nameOfMax=employeeNames[i];
   }
   if(employeeSalary[i]<min){
       min=employeeSalary[i];
       nameOfMin=employeeNames[i];
   }
    }

        System.out.println(nameOfMax+" has the maximum salary: "+max);//120000
        System.out.println(nameOfMin+" has the minimum salary: "+min);











}






    }

