import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
	
	int acc_no;
	String name;
	double balance;
	static final double min_balance = 5000;
	
	public BankAccount(int acc_no, String name) {
		this.acc_no = acc_no;
		this.name = name;
		this.balance = 10000; 
	}

	public BankAccount(int acc_no, String name, double balance) {
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (balance < min_balance) {
			System.out.println("You don't have the minimum balance to withdraw money.");
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		}
	}
	
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Enter a valid amount to deposit.");
		} else {
			balance += amount;
			System.out.println("Deposit successful. New balance: " + balance);
		}
	}
	
	public void showDetails() {
		System.out.println("Account Details:");
		System.out.println("Name: " + name);
		System.out.println("Account Number: " + acc_no);
		System.out.println("Balance: " + balance);
	}
	
	public static BankAccount findAccount(ArrayList<BankAccount> accounts, int acc_no) {
		for (BankAccount account : accounts) {
			if (account.acc_no == acc_no) {
				return account;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BankAccount> accounts = new ArrayList<>();
		boolean cond = true;
		
		while (cond) {
			System.out.println("1. Enter 1 to create a new account");
			System.out.println("2. Enter 2 for withdrawing Money");
			System.out.println("3. Enter 3 for Deposit");
			System.out.println("4. Enter 4 to check Balance");
			System.out.println("5. Enter 5 to Exit");
			
			int option = sc.nextInt();
			switch(option) {
				case 1:
					System.out.println("Enter account number:");
					int acc_no = sc.nextInt();
					sc.nextLine(); // consume newline
					System.out.println("Enter name:");
					String name = sc.nextLine();
					System.out.println("Enter initial balance:");
					double balance = sc.nextDouble();
					accounts.add(new BankAccount(acc_no, name, balance));
					System.out.println("Account created successfully.");
					break;
				case 2:
					System.out.println("Enter account number:");
					acc_no = sc.nextInt();
					BankAccount a = findAccount(accounts, acc_no);
					if (a != null) {
						System.out.println("Enter amount you need to withdraw:");
						double withdrawAmount = sc.nextDouble();
						a.withdraw(withdrawAmount);
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 3:
					System.out.println("Enter account number:");
					acc_no = sc.nextInt();
					a = findAccount(accounts, acc_no);
					if (a != null) {
						System.out.println("Enter amount you need to deposit:");
						double depositAmount = sc.nextDouble();
						a.deposit(depositAmount);
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 4:
					System.out.println("Enter account number:");
					acc_no = sc.nextInt();
					a = findAccount(accounts, acc_no);
					if (a != null) {
						a.showDetails();
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 5:
					cond = false;
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Enter a correct option.");
			}
		}
		sc.close();
	}
}
