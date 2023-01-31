import java.util.Scanner;

public class BankAccount {
    private static int acc = 1;
    private String name;
    private String account_type;
    private double balance;
    private long account_no;

    void createAccount() {
        Scanner scanner = new Scanner(System.in);

        account_no = acc++;

        System.out.println("Your Account No. " + account_no);
        System.out.println("Enter Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Account Type: ");
        account_type = scanner.nextLine();

        System.out.println("Enter Balance: ");
        balance = scanner.nextDouble();
    }

    void displayAccount() {
        System.out.println("Account No :  " + account_no);
        System.out.println("Account Holder Name :  " + name);
        System.out.println("Account Type :  " + account_type);
        System.out.println("Balance :  " + balance);
    }
}
