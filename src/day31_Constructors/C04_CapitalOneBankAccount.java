package day31_Constructors;

public class C04_CapitalOneBankAccount {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ali Veli", 123456789);


        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        account1.deposit(1500);
        account1.checkBalance(); // 1600

        System.out.println("_________________________________________");


        BankAccount account2 = new BankAccount();
        account2.setInfo("Kamil Bey", 98452135);

        account2.deposit(10000);
        account2.checkBalance();



    }

}
