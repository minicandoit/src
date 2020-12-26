package day35_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

      BankAccount account1=new BankAccount();

      account1.setInfo("mini","123456");

      account1.getInfo();

      account1.deposit(100);//available: 100

        account1.withdraw(80);

        account1.withdraw(20);

        account1.deposit(100000);

      account1.showBalance();

        account1.getInfo();


        BankAccount account2=new BankAccount();

        account2.setInfo("CK","23456");

        account2.deposit(200);
        account1.deposit(3000);
        account1.withdraw(50000);

        account1.showBalance();
        account2.showBalance();






    }
}
