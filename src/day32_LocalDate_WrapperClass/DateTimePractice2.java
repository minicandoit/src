package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimePractice2 {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");

        LocalDate DofB=LocalDate.of(2005,5,19);
        //10 years ago:
        int age1=LocalDate.now().minusYears(10).getYear()-DofB.getYear();
        //              2020-    10         =2010-1981
        System.out.println("10 years ago you were: "+age1+" years old");

        System.out.println("========================================");

        LocalDate dateOfBirth= LocalDate.of(1981,4,15);
        System.out.println("You were born on: "+dateOfBirth.format(df));
        int CurrentAge=LocalDate.now().getYear()-dateOfBirth.getYear();

        if(CurrentAge>=21){
            System.out.println("you are eligible to buy alcohol");
        }else{
           LocalDate eligible=LocalDate.of(LocalDate.now().plusYears(21-CurrentAge).getYear(),dateOfBirth.getMonthValue(),dateOfBirth.getDayOfMonth());
            //                                   2020+                     6
            System.err.println("You will be elegible to buy alcohol on: "+eligible.format(df));

        }












    }
}
