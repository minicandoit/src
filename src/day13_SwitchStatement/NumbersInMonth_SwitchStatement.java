package day13_SwitchStatement;

public class NumbersInMonth_SwitchStatement {
    public static void main(String[] args) {

        int n=99;
        String month="";

        switch (n){
            case 1:
                month="Jan";
                break;
            case 2:
                month="Feb";
                break;
            case 3:
                month="Mar";
                break;
            case 4:
                month="Apr";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="Jun";
                break;
            case 7:
                month="Jul";
                break;
            case 8:
                month="Aug";
                break;
            case 9:
                month="Sep";
                break;
            case 10:
                month="Oct";
                break;
            case 11:
                month="Nov";
                break;
            case 12:
                month="Dec";
                break;
            default:
                month="No such a month";
        }
        System.out.println(month);
        /*
         2. write a program that cna print the name of the month based on the number.
     if numbers is greater than 12 or less than 1, print invalid
            MUST use switch
         */
    }
}
