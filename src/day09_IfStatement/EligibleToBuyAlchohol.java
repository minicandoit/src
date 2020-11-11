package day09_IfStatement;

public class EligibleToBuyAlchohol {
    public static void main(String[] args) {
        String name="Aron";
        int age = 39;
        boolean isEligible=age>=21;
        System.out.println(name+" is eligible to buy alcohol?\n\t"+isEligible);

    }
}
/*
Warmup Tasks:
    1. write a program that can check if the person is eligible to buy alcohol
        Ex:
            name = "James"
            age = 19
            output:
                James is eligible to buy alcohol?
                    false

 */