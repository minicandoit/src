package day06_ArithmeticOperator;

public class GallonToLitters {
    public static void main(String[] args) {

        double gallon =1;
        double liters=gallon*3.78541;
        System.out.println(gallon+" gallons equal to "+liters+" liters");

        boolean exceeded300liters=liters> 300;
        //120.5 gallons exceeds 300 liters: true/false
        System.out.println(gallon+"gallons exceeds 300 liters: "+exceeded300liters);

    }
}
/*
Task02:
        create a class called GalonsToLiters, and write a program that can convert the gallons tto litters
            Ex:
                galon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                galon = 20
                 output:
                    20 gallons equal to 75.7082 liters
            Hint: 1 gallon = 3.78541 liters

 */