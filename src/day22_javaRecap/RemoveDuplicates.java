package day22_javaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {

    String str="abcabc";

        String result="";//"abc"

        for(int i=0;i<=str.length()-1;i++){//index number 0~lastnumber
            String eachCharacter=""+str.charAt(i);//a,b,c,a,b,c,gets each of character one by one
            //any"" conver to string

           if(result.contains(eachCharacter)){//if the character is already contained
               //in the result yet, then we concate the character
                continue;
            }else{//if character of str is not contained in the result yet,
                // then we cancate the character
               result +=eachCharacter;
                System.out.println("result ="+result);

            /*
            if (!result.contains(eachCharacter)) {

                result+=eachCharacter;
            }

            System.out.println("result ="+result);

            */
               result+=(!result.contains(eachCharacter))?eachCharacter:"";
            }
        }












    }
}
