package day17_Strings;

public class String_Equals {
    public static void main(String[] args) {

        String str="jira";
        String str2=new String("jira");

        System.out.println(str==str2);//false   object is different
        System.out.println(str.equals(str2));//true
        //this compares value not the objects--is different

        System.out.println(str.equals("jira"));//true if it's J false
        System.out.println(str.equalsIgnoreCase("JIRA"));
//true







    }
}
