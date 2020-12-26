package day39_StaticBlock;

import day37_customClass.Employee;

public class StaticBlocks {
    public static String company;
    public static Employee employee1 ;
   //Employee.employee1.setInfo() doesn't work,need one more step
    public static int b;
    public static boolean isEmployeed;


    public int a;

    //excel Sheet

    static{//only takes static variable
        company = "Capital One";
        isEmployeed = true;
        employee1 = new Employee();
        employee1.setInfo("john", company, "SDET", "A123", "Male", 40, 55);
        //
        // a = 100;-->not static
        b = 200;
        System.out.println("Static Block");
    }


    /*
    public static void main(String[] args) {
        company = "Capital One";
        isEmployeed = true;
        employee1 = new Employee();
        employee1.setInfo("john", company, "SDET", "A123", "Male", 40, 55);
        b = 200;
        System.out.println(company);
        System.out.println(employee1);
        System.out.println(b);
        System.out.println(isEmployeed);
    }
*/

}
