package day32_LocalDate_WrapperClass;

public class ParseMethods {
    public static void main(String[] args) {
        String data1="123";

        System.out.println(data1+3);//1233 returns you to concatenation text +3

       int num1 =Integer.parseInt(data1);
       //primitive==primitive//none of them,not an unboxing,not an autoboxing
        Integer num2     = Integer.parseInt(data1);
        //wrappre class<==primitive(Auto boxing)
        System.out.println(num1+3);
       String s1="Hello";
     // int num3= Integer.parseInt(s1);//no  number so error
      //  System.out.println(num3);
        String s2="2.5";
       double d1= Double.parseDouble(s2);//none
        //primitive<==primitive
       Double d2 =Double.parseDouble(s2);//autoboxing
       //wrapper class<==primitive
        System.out.println(d1+1);

       String s3="false" ;//maybe==>r1==>false,because default value of boolean is false
      boolean r1= Boolean.parseBoolean(s3);//none
      // primitive<==primitive
        Boolean r2=Boolean.parseBoolean(s3);//autoboxing
        //Wrapper class<==primitive
        System.out.println(!r1);//true

        String s4="TRue";//parse method is not case sensitive
        boolean r3=Boolean.parseBoolean(s4);
        System.out.println(r3);




    }
}
