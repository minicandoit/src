package day21_WhileLoops;

public class SubstringMethodPractice {
    public static void main(String[] args) {
        String email="John_Daniel@BOFA.com";
        int indexOf_=email.indexOf("_");
        int indexOfAt=email.lastIndexOf("@");
        String lastName=email.substring(0,indexOf_);
        String firstName=email.substring(indexOf_+1,indexOfAt);
String domain=email.substring(indexOfAt+1,email.lastIndexOf("."));

String fullName=firstName+" "+lastName;

        System.out.println("last name= "+lastName);
        System.out.println("first name= "+firstName);
        System.out.println("full name= "+fullName);
        System.out.println("domain = "+domain );


    }
}
/*
lastName_firstName@companyName.com
 */