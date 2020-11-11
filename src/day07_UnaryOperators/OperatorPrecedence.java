package day07_UnaryOperators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int x=2+3*2/1;
        //2+6/1
        //2+6=8
        System.out.println(x);
        int y=(2+3)*2;
        //5*2=10
        int z=2+3*2;//grouping ====different result

int w=78/2*2+3-5%5;
        System.out.println(w);
        int t=8+2+3+5-2-1-0+1*2;
        System.out.println(t);


    }
}
