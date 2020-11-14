package day29_Methods;

public class MethodsWithParameter {

    public static void main(String[] args) {

        int age=35;
   eligibleToBuyAlcohol(age);
   eligibleToBuyAlcohol(50);//only cares age of the person
        //matching data with parameter
        calculateAge(1972,2020);
    }

    public  static void eligibleToBuyAlcohol(int age){

        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not Eligible to buy alcohol");
        }
    }

    public  static void calculateAge(int birthYear,int currentYear){
       if(birthYear<currentYear) {
           System.out.println("Your age is: " + (currentYear - birthYear) + "years old");

       }else{
           System.out.println("Invalid Entry");
       }
    }



}
