package day26_Array;

public class palindromeStrings {
    public static void main(String[] args) {

        String[]names={"Anna","Nalan","Hannah","Emma","Aidai","Ciris","Yasin","bob","Eve"};

        int countPalindrome=0;

        for(int j=0;j<=names.length-1;j++) {

            String original = names[j];//"Anna"

            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {

                reversed += original.charAt(i);

            }
            if (original.equalsIgnoreCase(reversed)) {
                countPalindrome++;
                System.out.println(original);
            }

        }

        System.out.println("countPalindrome :"+countPalindrome);
    }
}
