package day11_MultiBranchIf;

public class TernaryPractice {
    public static void main(String[] args) {

        int n=100;
        String result1="";

        if(n%2==0){
            result1="Even";
        }else {
            result1="Odd";
        }
        System.out.println(result1);

        System.out.println("================================");

        String result2=(n%2==0)?"Even":"Odd";
//        variavle    =condition ?(if) body :(else) body;
        System.out.println(result2);

        System.out.println("================================");
int age=25;
String citizenShip="USA";

String eligibleToVote=(age>=18&&citizenShip=="USA")?"Eligible to Vote":"Not eligible to vote";

        System.out.println(eligibleToVote);

        System.out.println("=========================================");

int personAge=18;

String buyAlcohol=(personAge>=21)?"Eligible to buy":"Not eligible to buy";


        System.out.println(buyAlcohol);

        System.out.println("========================================");

int number=1000;
String s1="";

if(number>0){
    s1="positive";
}else if(number<0){
    s1="Negative";
}else{
    s1="Zero";
}//returns to string value
        System.out.println(s1);

String s2=(number>0)?"positive":(number<0)?"negative":"Zero";

        System.out.println(s2);






















    }
}
