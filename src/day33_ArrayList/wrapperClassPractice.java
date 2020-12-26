package day33_ArrayList;

public class wrapperClassPractice {
    public static void main(String[] args) {

String str="a1b2c3";//on askii tabel 1==49,2==50,3==51

int sum=0;
/*
for(int i=0;i<=str.length()-1;i++){to verify if each char in string is a digit
    if(Character.isDigit(str.charAt(i))){
        sum+=Integer.parseInt(""+str.charAt(i));
        //each digits need to be converted to integer and added to the sum
    }
}

 */
for(char each:str.toCharArray()){
   if(Character.isDigit(each)) {
       sum+=Integer.parseInt(""+each);//each is char
       //each digits need to be converted to integer and added to the sum
       // sum+=Integer.valueOf(each);==>same,unboxing wrapper to primitive
       //                   ""+each==>same
  // sum+=each; 49+50+51   so parse or value of have to use
   }
}

        System.out.println("sum= "+sum);

        System.out.println("=========================");

        String  password="Password#7";
        String upperLetters="";
        String lowerLetters="";
        String digits="";
        String specialChar="";

        for(char each:password.toCharArray()){
            if(Character.isUpperCase(each)){//verify if the character is upper case
                upperLetters+=each;

            }else if(Character.isLowerCase(each)){//verify if the character is Lower case
                lowerLetters+=each;
            }else if(Character.isDigit(each)){
                digits+=each;
            }else{//special character
                specialChar+=each;
            }
        }

        System.out.println("UpperLetters = "+upperLetters);
        System.out.println("LowerLetter = "+lowerLetters);
        System.out.println("digits = "+digits);
        System.out.println("Special Characters = "+specialChar);

        boolean isValid= password.length()>=8&& upperLetters.length()>0&&lowerLetters.length()>0&&digits.length()>0&specialChar.length()>0;
        System.out.println(isValid);








    }
}
/*
 3. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)



 /*
1.8 character at least
2.there must be a digit(isUpper   isLowercase)
3.there must be a letter(at least one upper case and one lower case)
4.there must be special character
 */




