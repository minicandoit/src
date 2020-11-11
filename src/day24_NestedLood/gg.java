package day24_NestedLood;

public class gg {
    public static void main(String[] args) {
        String str=" ";
        str.trim();
        System.out.println(str);
        boolean A=str.isEmpty();
        System.out.println(A);

        System.out.println("===============");
    String ta="A ";
    ta=ta.concat("B ");
    String tb="C ";
    ta=ta+tb;
   ta= ta.replace("C","D");
    ta=ta+tb;
        System.out.println(ta);


        System.out.println("===========");

        String s1="abc";
        String s2="abc";

        System.out.println("s1==s2 is:"+s1==s2);

       //


        System.out.println("====================");

        String str1="Hellohello World";
        str1.trim();
        int z=str1.indexOf(" ");
        System.out.println(z);//z=10


    }
}
