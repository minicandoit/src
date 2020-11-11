package day06_ArithmeticOperator;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary=100000;
        double stateTaxRate=0.08;
        double federalTaxRate=0.21;

        /*
        double salary=100000, stateTaxRate=0.08,federalTaxRate=0.21, stateTax=salary*stateTaxRate
         ,federalTax=salary*federalTaxRate
        , yourTotalTax=stateTax+federalTax
        , yourSlaryAfterTax=salary-yourTotalTax;

         */
        double stateTax=salary*stateTaxRate;
        double federalTax=salary*federalTaxRate;
        double yourTotalTax=stateTax+federalTax;
        double yourSlaryAfterTax=salary-yourTotalTax;

        System.out.println("Your salary is: $ "+salary);
        System.out.println("Your state tax is: $ "+stateTax);
        System.out.println("Your federal tax is: $ "+federalTax);
        System.out.println("Your total tax is: $ "+yourTotalTax);
        System.out.println("Your salary after tax is: $ "+yourSlaryAfterTax);

    }




}
/*
Task01: SalaryCalculator
    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

 */