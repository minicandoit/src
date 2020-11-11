package day12_NestedIf;

public class Loan {
    public static void main(String[] args) {

        double minimumSalary=25000;
        int jopHistory=15;
        int creditScore=750;

        if(minimumSalary>=30000){
            if(jopHistory>=2){
                if(creditScore>=680){
                    System.out.println("You are qualified for loan");
                }else{
                    System.out.println("You must have at least 680 credit score");
                }
            }else{
                System.out.println("You must be on the job at least for 2 years ");
            }



        }else{
            System.out.println("You must habve minimum of 30K salary first");
        }


    }
}
