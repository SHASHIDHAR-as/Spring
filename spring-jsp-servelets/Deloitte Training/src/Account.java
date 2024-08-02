import java.util.Scanner;

public class Account {
    
    int acc_no;
    String name;
    double balance;
    static final double min_balance = 5000;

    public Account(int acc_no, String name) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = 10000; 
    }

    public Account(int acc_no, String name, double balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance - amount < min_balance) {
            System.out.println("You don't have enough balance to maintain the minimum balance after withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
    }

    public void showDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account(01, "Shashi", 20000);
        boolean cond = true;

        while (cond) {
            System.out.print("1. Enter 1 for withdrawing money\n2. Enter 2 for deposit\n3. Enter 3 to check balance\n4. Enter 4 to exit\n");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter amount you need to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    a.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount you need to deposit:");
                    double depositAmount = sc.nextDouble();
                    a.deposit(depositAmount);
                    break;
                case 3:
                    a.showDetails();
                    break;
                case 4:
                    cond = false;
                    break;
                default:
                    System.out.println("Enter a correct option.");
            }
        }
    }
}
