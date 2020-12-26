package day41_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount obj1=new BankAccount("mini","Bae",1234567);

        System.out.println(obj1.getAccountHolder());
        System.out.println(obj1.getBalance());

        obj1.deposit(-200);
        obj1.availableBalance();

        System.out.println("================================");

        obj1.deposit(100);
        obj1.availableBalance();

      //  BankAccount.bankName-"Capital One"; final can't be reassigned

        System.out.println(BankAccount.bankName);










    }

}
