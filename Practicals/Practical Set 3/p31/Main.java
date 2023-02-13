
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.createAccount();

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.createAccount();

        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.createAccount();

        bankAccount1.displayAccount();
        bankAccount2.displayAccount();
        bankAccount3.displayAccount();
    }
}
