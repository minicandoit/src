package day10_IfElseStatement;

public class post_VS_Pre {
    public static void main(String[] args) {
        //pre:
        int x=7;//if it's double

        System.out.println(++x);//8==8.0
        System.out.println(x);//8==8.0

        System.out.println(--x);//7==7.0
        System.out.println(x);//7==7.0
        System.out.println("===============================");
        //post : pass the current

        double y=7;//8.0
        System.out.println(y++);//7.0
        System.out.println(y);//8.0
        System.out.println(y--);//8.0
        System.out.println(y);//7.0
    }
}
