package day29_Methods;

public class MethodsWithoutTheParameters {
    public static void main(String[] args) {
        //AccessModifier  specifier   returnTYPE   MethodName (Parameter){
        //                        statements}
    printHello5Times();
        System.out.println("mini");
        printHello5Times();
        System.out.println("cybertek");
        printHello5Times();

        MethodsWithoutTheParameters.printHello5Times();
        System.out.println("Odd numbers: ");
        MethodWithoutTheParameter2.printEvenNumbers1to100();
        System.out.println("Even numbers: ");
        MethodWithoutTheParameter2.printOddNumbers1to100();
    }
        public static void printHello5Times(){
            for(int i=1;i<6;i++){
                System.out.println("Hello");
            }
        }

}
/*

        step1: print hello 5 times  (for loop)
        step2: print your name
        step3: print hello 5 times  (for loop)
        step4: print your school name
        step5: print hello 5 times   (for loop)

 */