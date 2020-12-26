package day35_CustomClass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListPractice {
    public static void main(String[] args) {

        String[] countryNames = {"Korea","Andorra","United Arab Emirates","Afghanistan","Turkey","United States"," Antigua and Barbuda","Albania", "Colombia", "Venezuela", "Panama","United Kingdom", "Mexico ", "United States"};

        ArrayList<String>countries=new ArrayList<>(Arrays.asList(countryNames));

        System.out.println(countries);

     //   Predicate<String>length10=p->p.length()>=10;

        countries.removeIf(p->p.length()>=10);//p is String==>each element of countries
//predicates
        System.out.println(countries);

        System.out.println("=====================================");

        LocalDate[]arr1={
          LocalDate.of(2020,11,23),
                LocalDate.of(2010,11,23),
                LocalDate.of(2011,11,23),
                LocalDate.of(2012,11,23),
                LocalDate.of(2013,11,23),
                LocalDate.of(2014,11,23),
                LocalDate.of(2015,11,23),
                LocalDate.of(2016,11,23),
                LocalDate.of(2017,11,23),
                LocalDate.of(2018,11,23),
                LocalDate.of(2019,11,23),

        };

        LocalDate d1=LocalDate.of(2016,8,16);
        ArrayList<LocalDate>dates=new ArrayList<>(Arrays.asList(arr1));//if it's not primitive directly convert to arrayList

        System.out.println(dates);

        dates.removeIf(p->p.isBefore(d1));

        DateTimeFormatter df= DateTimeFormatter.ofPattern("MMMM-dd-yyyy, EEEE");

        System.out.println(dates);

        for(LocalDate each:dates){
            System.out.println(each.format(df));
        }


















    }
}
/*
 task01:
            1. create an Array of string called country names
            2. write a program that can remove all the country names that have length of 10 or greater
    task02:
            1. create an Array of LocalDate
            2. write a program that can remove all the dates before August-15-2016
    task03:
            1. create an Array of String called jobTitles
            2. write a program that only keeps the jobTitles that are: SDET and QA
    task04:
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
                solution 1: use lambda
                solution 2: do not use lambda

 */