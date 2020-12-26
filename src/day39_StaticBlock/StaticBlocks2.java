package day39_StaticBlock;

public class StaticBlocks2 {
    public static void main(String[] args) {

        System.out.println("Main Method");
//only one time in the class
    }

    static{
        System.out.println("Static Block 1");
    }//as many as you can in the class
    //static executes first always static and then main

    static{
        System.out.println("Static block 2");
    }

    static{
        System.out.println("Static block 3");
    }




}
