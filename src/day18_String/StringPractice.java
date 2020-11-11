package day18_String;

public class StringPractice {
    public static void main(String[] args) {

        String s1="Cat";
        String s2="Cat";
        //it will create one object
        System.out.println(s1==s2);
String s3= new String("Cat");
//in the java heap

        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//false two different object two different memory location

String s4=new String("Cat");
//it will create the new object
        System.out.println(s3==s4);//false
//in the same heap but different object


        //.equals()
        System.out.println(s1.equals(s3));//true ,doesn't need to worry about memory location but the text

        System.out.println(s2.equals(s3));//true
//                    string pool,  heap====different object different location
        System.out.println(s3.equals(s4));//true


        String s5=new String("cat");//new object
        System.out.println(s4.equals(s5));//false because  case sensitive
        System.out.println(s4.equalsIgnoreCase(s5));//true,equalsIgnoreCase is not
        //case sensitive

        System.out.println("===========================");
//String str="cybertek";
//str.toLowerCase();//new String created"CYBERTEK"==assign this variable to new abject

        //System.out.println(str);//will be lowercase

        String str="cybertek";
        str= str.toLowerCase();//new String created"CYBERTEK"==assign this variable to new abject

        System.out.println(str);//will be lowercase

        str.toLowerCase();//cannot modify,"cybertek"

        System.out.println(str);//still uppercase
        str=str.toLowerCase();
        System.out.println(str);//lower case now

        System.out.println("=======================================");

        String name="Cybertek School";
        //           0123456789
        int n1= name.length();//14
                              //last index: 13
        System.out.println(n1);

        String name2="Muhtar";
        //            012345
        int n2=name2.length();//6

//                             last index:5
        int lastIndex=name2.length()-1;
        System.out.println(n2);
        System.out.println(lastIndex);

        System.out.println("============================================");
String a="Java Programming Language";

            char firstChar = a.charAt(0);
            char lastChar = a.charAt( a.length()-1 );
            //       last index num of a
// last index num of a
        System.out.println("first character: "+firstChar);
        System.out.println("Last character: "+lastChar);

        System.out.println("==============================================");

String b="Today is Monday, and it's fun";//never know what's the last index number

char secondChar=b.charAt(1);//b.length()-1==>last character
char secondLastChar=b.charAt(b.length()-2);//secondChar from the last//-1-1 same
        System.out.println("secondChar ="+secondChar);
        System.out.println("secondLastChar ="+secondLastChar);




























    }


}
