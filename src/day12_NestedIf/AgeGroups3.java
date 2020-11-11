package day12_NestedIf;

public class AgeGroups3 {
    public static void main(String[] args) {

      int age=18;//with ternary


        String ageGroups=(age<=2)?"infant":(age<=5)?"Toddeler"
                :(age<=9)?"kid":(age<=12)?"pre-teen"
                :(age<=17)?"Teenager":(age<=20)?"Young Adult":(age<=39)?
                "Adult":(age<=49)?"Young Middle-Aged Adult":(age<=54)?"Middle-Aged Adult "
                :(age<=64)?"Very Young Senior Citizen":(age<=74)?"Young Senior Citizen "
                :(age<=84)?"Senior Citizen":"Old Senior Citizen";


/*
        String result=(age>=1&&age<=2)?"infant":(age>=3&&age<=5)?"Toddeler"
                :(age>=6&&age<=9)?"kid":(age>=10&&age<=12)?"pre-teen"
                :(age>=13&&age<=17)?"Teenager":(age>=18&&age<=20)?"Young Adult":(age>=21&&age<=39)?
                "Adult":(age>=40&&age<=49)?"Young Middle-Aged Adult":(age>=50&&age<=54)?"Middle-Aged Adult "
                :(age>=55&&age<=64)?"Very Young Senior Citizen":(age>=65&&age<=74)?"Young Senior Citizen "
                :(age>=75&&age<=84)?"Senior Citizen":"Old Senior Citizen";
*/
        System.out.println(ageGroups);
    }
}
