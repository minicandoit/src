package day28_MultiDimensionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {

        String []employeeNames={"Mini","Sam","Sara","Nana","Lulu","Mike","Angel","Peter"};
//                                 0       1     2     3      4
        int[]employeeSalary={100000,110000,105000,120000,125000,125000,125000,100000};
//                             0       1       2      3      4    5      6      7
int max=employeeSalary[0];

int min=employeeSalary[0];

for(int each:employeeSalary){
    if(each>max){
        max=each;//to find the maximum salary
    }
    if(each<min){
        min=each;
    }
}
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

for(int i=0;i<=employeeNames.length-1;i++){//to compare the employees salary with maximum salary
    if(max==employeeSalary[i]){//if the employee's salary is equal to max salary
        System.out.println(employeeNames[i]);// then print the name of employee
    }
}




    }
}
