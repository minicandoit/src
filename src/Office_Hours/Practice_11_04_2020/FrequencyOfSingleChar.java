package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
//       "aaabbc"
     //   012345
        System.out.println("Enter a character");
        char ch=scan.next().charAt(0);
        //'a'
        scan.close();//you will not be able to use it
        int frequency=0;

        for(int i=0;i<str.length();i++){

            if(ch==str.charAt(i)){
                frequency++;
            }

        }

        System.out.println(frequency);


    }
}
