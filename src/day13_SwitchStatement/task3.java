package day13_SwitchStatement;

public class task3 {
    public static void main(String[] args) {
int age=10;
String result="";
if(age>=0&&age<=150){if(age<21){
    result="Teenager";
}else if(age>=21&&age<55){
    result="Adult";
}else{
    result="Senior";
}

}else{
    result="no such a  age group";
}
        System.out.println(result);
/*
 3. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                Hint:  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF

 */

    }
}
