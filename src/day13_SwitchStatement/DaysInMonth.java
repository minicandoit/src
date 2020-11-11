package day13_SwitchStatement;

public class DaysInMonth {
    public static void main(String[] args) {

        int year = 2020;
        int month = 19;//1~12
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28Or29Days = month == 2;//for short variable you dont need a boolean
//boolean has31Days=!has28Or29Days&&!has30days;
        String result = "";

        if (month >= 1 && month <= 12) {
            if (has28Or29Days) {//for feb
                if (year % 4 == 0) {//reap year
                    result = "29 days";
                } else {//not leap year
                    result = "28 days";
                }
            } else if (has30days) {//for apr,jun,sep,nov
                result = "30 days";
            } else {
                result = "31 days";//for jan,mar,may,jul,aug,oct,dec
            }


        } else {//if the month is invalid
            result = "Invalid";
        }


        System.out.println(result);


        //precondition:1~12,
        //days: 28,29,30,31
   /*
     String result="=";
    int months=2;
        if(months>=1&&months<=12){if(months==1) {
            result = "Jan";} else if(months==2){
            result="Feb";
        }else if(months==3){
            result="Mar";
        }else if(months==4){
            result="Apr";
        }else if(months==5){
          result="May";
        }else if(months==6){
            result="Jun";
        }else if(months==7){
            result="Jul";
        }else if(months==8){
            result="Aug";
        }else if(months==9){
            result="Sep";
        }else if(months==10){
            result="Oct";
        }else if(months==11){
            result="Nov";
        }else{
            result="Dec";
        }
        }else{result="There's no such a month";

        }


        System.out.println(result);
        */

        /*
         2. write a program that can find the number of days in a month
            Note: MUST USE NESTED IF

         */
    }
}
