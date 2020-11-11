package day11_MultiBranchIf;

public class DaysInWeek {
    public static void main(String[] args) {
     int number=5;//1~7
     String day=" ";
     if (number==1){
         day="monday";
     }else if(number==2){
         day="tuesday";
     }else if (number==3){
         day="wednesday";
     }else if (number==4){
         day="Thursday";
     }else if(number==5){
         day="friday";
     }else if(number==6){
         day="saturday";
     }else{
         day="sunday";
     }
        System.out.println("Today is : "+day);

        System.out.println("===========================");







      /*
         number=1;//1~7
        output:Monday
        number=5
        output:
        Friday



      */





    }
}
