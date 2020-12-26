package Office_Hours.Practice_11_27_2020;

public class CharacterPractice {
    public static void main(String[] args) {

        int countSpecialChars = 0;
        int countLetters = 0;
        int countDigits = 0;

        for (int i = 0; i <= Character.MAX_VALUE; i++) {
            char each = (char) i;

            if (!Character.isLetterOrDigit(each)) {//for printing all the letters

                countSpecialChars++;
            } else if (Character.isLetter(each)) {
                countLetters++;
            } else {
                countDigits++;
            }

/*
        int max = Character.MAX_VALUE;
        System.out.println(max);
        for (int i = 1; i < Character.MAX_VALUE; i++) {
            char each = (char) i;

            if (!Character.isLetterOrDigit(each)) {//for printing all the letters
                System.out.print(each + "");
            }

        }


 */
        }

        System.out.println("countSpecialChars =" + countSpecialChars);
        System.out.println("countLetters =" + countLetters);
        System.out.println("countDigits =" + countDigits);
    }
}