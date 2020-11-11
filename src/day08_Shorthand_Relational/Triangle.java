package day08_Shorthand_Relational;

public class Triangle {
    public static void main(String[] args) {
        double angle1=60;
        double angle2=60;
        double angle=90;
        double sum = angle1+angle2+angle;
        boolean isValid =sum==180;
        System.out.println("The Triangle is valid: "+isValid);
    }
}
/*
task:
    1. write a program that can check if the the given triangle is valid
            angle1 = 30
            angle2 = 30
            angle = 90
            sum = 150
            isValid
        output:
            The triangle is valid: false

 */