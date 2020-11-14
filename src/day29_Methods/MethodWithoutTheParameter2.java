package day29_Methods;

public class MethodWithoutTheParameter2 {
    public static void main(String[] args) {
printOddNumbers1to100();
printEvenNumbers1to100();


    }

        public static void printOddNumbers1to100 () {
for(int i=1;i<=100;i++){

   if(i%2!=0) {
       System.out.print(i + " ");
   }
}
            System.out.println();

        }

        public static void printEvenNumbers1to100(){

        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
            System.out.println();
        }

/*
void method without parameter
void method with parameter

return methods

overloading
 */







}
