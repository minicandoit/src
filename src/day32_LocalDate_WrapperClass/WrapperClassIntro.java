package day32_LocalDate_WrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {
        byte b=100;
        Byte b2=b;// autoboxing ,at the end Byte wrapper class value
        //they do not accept any other own primitives
        //Integer b3=(int)b; do not use casting though it's working
      //  String str1=b;String is not wrapper class

        int i=10;
       // Byte b3=i;//wrapper class dedicated to its own primitives
        //wrapper exist only for primitives

        Integer I=20;//unboxing, assigning to wrapper class to primitive
        double d=I;//primitives accepts anything as long as it is in the range
        long l=I;//can it happen between different primitives

        Integer num=100;
     //   Long L1=num;
        long L2=num;

        System.out.println("========================================");

        Character ch='A';
        char ch2=ch;//unboxing
        int n=ch;//unboxing,nums of the ch is between in the range

        long score=100;
        //Wrapper class only dedicated to only its own primitives so only Long wrapper class
        //Double d1=(double)score, if force by casting no more long value but a double
        Long d2=score;//autoboxing=====>teacher says unboxing

        Long d3=d2;//none ,assigning wrapper to wrapper

        double d4=score;//none









    }
}
