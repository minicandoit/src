package day14_Switch_Recap;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 45;
        int weekliyHours = 35;
        int numberOfWeeks = 50;

        int salary = 0;
        if (hourlyRate > 0) {
            if (weekliyHours > 1 && weekliyHours <= 65) {
                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {
                    salary = hourlyRate * weekliyHours * numberOfWeeks;
                    System.out.println("your salary is: " + salary);
                } else {
                    System.err.println("number of weeks cannot be less than 1 or greater than 52");
                }
            } else {
                System.err.println("Weekly hours cannot be less than 1 or greater than 65");
            }
        } else {
            System.err.println("Hourly Rate cannot be Negative or 0");
        }//error message


    }

    }

/*
1. write a program for the salary calculator
			given info:
					hourlyRate 40$
					weeklyHours 45hours
					numberofWeeks 48weeks
			pre conditions: hourlyRate cannot be negative
							weekly hours cannot be negative or more than 65
							numberOfWeeks cannot be more than 52 weeks or less than 1




 */