package Office_Hours.Practice_11_04_2020;

public class SliceNumbers2 {
    public static void main(String[] args) {

        int number = 12345;
        String str = "" + number;//"12345"by concating


        for (int i = 0, j = 1; i < str.length(); i++, j++) {
            System.out.println("digit" + j + ": " + str.charAt(i));
      /*
        System.out.println("digit2: "+str.charAt(1));
        System.out.println("digit3: "+str.charAt(2));
        System.out.println("digit4: "+str.charAt(3));
        System.out.println("digit5: "+str.charAt(4));

        *///    if you don't put j  "digit"+(i+1)+": " + str.charAt(i)


        }


    }
}