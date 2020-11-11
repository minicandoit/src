package day11_MultiBranchIf;

public class MaxMin1 {
    public static void main(String[] args) {

        int a=10000;
        int b=200;
         int max1=0;
         if(a>b){
             max1=a;
         }else{
             max1=b;
         }
        System.out.println(max1);//System.out.println("Max number in If: "+max1);

         int max2=(a>b)?a:b;
        System.out.println(max2);//System.out.println("Max number in Ternary: "+max2);

/*
        int n1=100;
        int n2=200;
         String Maximum="";

         if(n1>n2){
             Maximum="n1 is maximum";
         }else{
             Maximum="n2 is maximum";
         }
        System.out.println(Maximum);

     String Maximum1= (n1>n2)?"n1 is maximum":"n2 is maximum";

        System.out.println(Maximum1);

*/
        System.out.println("======================");
/*
        int num1=100;
        int num2=200;
        String Minimum="";

        if (num1<num2){
            Minimum="n1 is minimum";
        }else{
            Minimum="n2 is minimum";
        }

        System.out.println(Minimum);

        String Minimum1=(num1<num2)?"n1 is minimum":"n2 is minimum";

        System.out.println(Minimum);

*/
   int min1=0;
   if(a<b){
       min1=a;
   }else{
       min1=b;
   }
        System.out.println("Minimum number is: "+min1);


   int min2=(a<b)?a:b;

        System.out.println("Minimum mumber is: "+min2);



    }
}
