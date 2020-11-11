package day17_Strings;

public class String_Mutability {
    public static void main(String[] args) {


        String wordOne="Friday";
        String wordTwo=wordOne;
        String wordThree="Friday";
        wordOne="Monday";
        System.out.println(wordTwo);//friday
        System.out.println(wordOne);//monday
        System.out.println(wordOne==wordThree);//false








    }
}
