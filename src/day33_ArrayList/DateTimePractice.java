package day33_ArrayList;

import com.sun.javafx.geom.Edge;
import com.sun.tools.corba.se.idl.constExpr.Negative;
import com.sun.tools.corba.se.idl.constExpr.Positive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy ");
        LocalDateTime d1 = LocalDateTime.of(2020, 11, 24, 13, 0);


        System.out.println(d1);
        System.out.println(d1.format(dtf).replaceFirst("PM", "pm"));
        System.out.println("=============================");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd, E");//3E or E=>same

        LocalDate[] days = new LocalDate[10];

        for (int i = 0; i <= days.length - 1; i++) {
            days[i] = LocalDate.now().plusDays(i + 1);//+1 starting from tomorrow
        }
        System.out.println(Arrays.toString(days));



        for (LocalDate each : days) {
            System.out.println(each.format(df));

        }

        System.out.println("===========================================");

        String[] friends = {"Polina", "Serhii", "Aziz", "Halzat", "Abdujilil", "Ayse"};
        LocalDate[] dOfB = {
                LocalDate.of(1991, 9, 25),
                LocalDate.of(1990, 11, 23),
                LocalDate.of(1995, 02, 10),
                LocalDate.of(2000, 03, 15),
                LocalDate.of(2005, 04, 20),
                LocalDate.of(2010, 05, 25)
        };

       String nameOfOlder=friends[0];
      LocalDate older=dOfB[0];

      String nameOfYoungest=friends[0];
      LocalDate younger=dOfB[0];

      for(int i=0;i<=dOfB.length-1;i++){

          if(dOfB[i].isBefore(older)){
              older=dOfB[i];
              nameOfOlder=friends[i];
          }
          if(dOfB[i].isAfter(younger)){
              younger=dOfB[i];
              nameOfYoungest=friends[i];
          }
      }
        System.out.println(nameOfOlder+" : "+older);
        System.out.println(nameOfYoungest+" : "+younger);

    /*
    create an array of String and store 5 of your friends names
    create an array of LocalDate and store their DofB

    find out who is youngest and oldest
     */











    }
}
/*
  DateTimePractice
    1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
    2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following formar:
                MonthName/Day, Name
                ex:
                    November/25, Wednesday

 */