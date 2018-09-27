package bankAccount;
import java.util.*;

public class BankAccount {
	Random r = new Random();
	private static int numberOfAccounts = 0;
	private static double totalChecking;
	private static double totalSavings;
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	private String accountNumber = "";
	public void account(double checking, double savings) {
		this.checkingBalance = checking;
		this.savingsBalance = savings;
		this.accountNumber = createAccountNumber();
		numberOfAccounts++;
		totalChecking+=checking;
		totalSavings+=savings;
		System.out.println(this.accountNumber);
	}
	private String createAccountNumber() {
		String acctNumber = "";
		for(int i = 0; i < 10; i++) {
			acctNumber+=r.nextInt(9);
		}
		return acctNumber;
	}
	public void getCheckingBalance() {
		System.out.println("The checking balance is $" + this.checkingBalance);
	}
	public void getSavingsBalance() {
		System.out.println("The savings balance is $" + this.savingsBalance);
	}
	public void deposit(String acct, double amt) {
		if(acct == "Checking") {
			checkingBalance+=amt;
			totalChecking+=amt;
		}
		else if(acct == "Savings") {
			savingsBalance+=amt;
			totalSavings+=amt;
		}
		else {
			System.out.println("please choose a valid account for your deposit");
		}
	}
	public void withdrawal(String acct, double amt) {
		if(acct == "Checking") {
			if(checkingBalance >= amt) {
				checkingBalance-=amt;
				totalChecking-=amt;
			}
			else {
				System.out.println("You have insufficient funds for this transaction");
			}
		}
		else if(acct == "Savings") {
			if(savingsBalance >= amt) {
				savingsBalance-=amt;
				totalSavings-=amt;
			}
			else {
				System.out.println("You have insufficient funds for this transaction");
			}
		}
		else {
			System.out.println("please choose a valid account for your withdrawal");
		}
	}
	public void getNumberOfAccounts() {
		System.out.println(numberOfAccounts);
	}
	public void getTotals() {
		System.out.println("The total dollar amount in checking accounts is: $" + totalChecking + "\n" + "The total dollar amount in savings accounts is: $" + totalSavings);
	}
}
