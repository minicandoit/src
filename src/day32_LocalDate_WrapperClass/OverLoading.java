package day32_LocalDate_WrapperClass;

public class OverLoading {
    public static void main(String[] args) {
        System.out.println("String");
       int[]arr1={1,2,3};
        main(arr1);//int
        //... !=[]


    }//execute original main method only
    //main is executing for running the code
    public static void main(int[]args){//... only be used in the parameter
        System.out.println("int");
    }
    public static void main(double[]args){
        System.out.println("double");
    }
    public static void main(char[]args){
        System.out.println("char");
    }

}
