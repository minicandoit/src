package day05_Concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {
        String firstName = "John";//""for the texts
        String lastName = "Daniel";
        String fullName= firstName +" "+lastName;//string ==>text whether use '' or "" same result

        System.out.println("Employee' full name is: ");
        System.out.println(fullName);//when you use variable no "" for text ""

        char gender = 'm';//''for single characters
        System.out.print(fullName);
        System.out.println("' gender is: ");
        System.out.println(gender);

        int age = 35;//can use byte but int is prefered

        System.out.print(fullName);
        System.out.print("' age is: ");
        System.out.print(age);
        System.out.println("Years Old");

        String companyName = "CapitalOne";

        System.out.print(fullName);
        System.out.print("' works at: ");
        System.out.println(companyName);


        String jopTitle = "SDET";

        System.out.print(fullName);
        System.out.print("' Job Title is: ");
        System.out.println(jopTitle);

       double salary = 120000.5;
       //if you put number integer(100000) still takes as double 100000.0

        System.out.print(fullName);
        System.out.print("' salary is: $");
        System.out.println(salary);

        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.print(fullName);
        System.out.print(" is full time employee: ");//is maried
        System.out.println(isFullTime);//isMarried


/*
Warmup tasks:
        1. create a class named EmployeeInfo
                declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

 */
    }
}
