package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //salary 100000, taxrate : 0.28
       int  salary = 1500000;//whole number
       double taxRate =0.28;//decimal
       double totalTax=salary*taxRate;
       double salaryAfterTax = salary - totalTax;
        System.out.println("Your total tax will be: ");
        System.out.println(totalTax);
        System.out.println("Your salary ater tax will be: ");
        System.out.print("$");
        System.out.println(salaryAfterTax);

  /* double salary1 = 200_000;
   double stateTaxRate=1.2;
   double federalTasRate=2.1;
   double stateTax=salary1*stateTaxRate;
   double federalTax=salary1*federalTasRate;
   double totalTax1=stateTax+federalTax;
   double salraryAferTax1=salary-totalTax1;

        System.out.println("your salary is: "+salary1);

        System.out.println("your state tax is : "+stateTax);
        System.out.println("your federal tax is : "+federalTax);
        System.out.println("your total tax is  "+totalTax1);
        System.out.println("your salary after tax is : "+salraryAferTax1);*/


        /*
Task: SalaryCalculator

    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

 */





    }

}
/*
Task04: SalaryCalculator
    write a program that can calculate the salary after tax based on the salary and tax rate
            Ex:
                if salary = 100000
                   tax = 0.28
                   total tax =salary * taxRate
                   salary after tax = salary-totalTas

 */