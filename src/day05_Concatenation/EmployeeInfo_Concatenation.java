package day05_Concatenation;

public class EmployeeInfo_Concatenation {
    public static void main(String[] args) {

        String firstName = "John";//""for the texts
        String lastName = "Daniel";
        String fullName= firstName +" "+lastName;//string ==>text whether use '' or "" same result
        char gender = 'm';//''for single characters
        int age = 35;//can use byte but int is prefered
        String companyName = "CapitalOne";
        String jopTitle = "SDET";
        double salary = 120000.5;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.println("Employee's full name is: "+fullName);
        System.out.println(fullName+"' gender is: "+gender);
        System.out.println(fullName+"' age is: "+age+" years old");
        System.out.println(fullName+"works at "+"\""+companyName+"\"");//to put double quote \" because java already using ""
        System.out.println(fullName+"' job title is: "+jopTitle);
        System.out.println(fullName+"' salary is: $ "+salary);
        System.out.println(fullName);
    }
}
