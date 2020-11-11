package day11_MultiBranchIf;

public class QuizQuestion {
    public static void main(String[] args) {

        int ivar=100;
        double dvar=200;
        float fvar=300;

        ivar=(int)fvar;//explicit casting
        fvar=ivar;//implicit casting
       dvar= fvar;//implicit casting
        fvar=(float)dvar;//explicit casting==manually
        dvar=ivar;//implicit casting
        ivar=(int)dvar;//explicit casting

        int a=3,b=2;
        long c=(a+b)*2/3%2;
        //      5*2/3%2
        //      10/3%2  ===>int10/int3=3 only integer section
        //       3%2
        //        1

        System.out.println(c);














    }
}
