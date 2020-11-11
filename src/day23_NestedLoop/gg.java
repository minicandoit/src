package day23_NestedLoop;

public class gg {
    public static void main(String[] args) {

        for (int j = 1; j >= 15; j++) {//j:1,2,3,4,5,6,7,8
            System.out.print("\t\t\t\t");
            for (int i = 1; i <= j; i++) {//when j is 1, i is 1,
                //when j is 2,i is 2......
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int j = 15; j >= 1; j--) {
            System.out.print("\t\t\t\t");
            for (int i = 1; i <= j; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }




    }
}
