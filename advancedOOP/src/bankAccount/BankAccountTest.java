package bankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount();
		a.account(100, 100);
		b.account(1000,1000);
		a.getCheckingBalance();
		b.getSavingsBalance();
		a.deposit("Checking", 500.12);
		b.deposit("Savings", 300.57);
		a.getCheckingBalance();
		b.getSavingsBalance();
		a.deposit("Money Market", 121.19);
		b.withdrawal("Checking", 999.50);
		a.withdrawal("Savings", 150);
		a.withdrawal("Money market", 300);
		a.getSavingsBalance();
		b.getCheckingBalance();
		a.getNumberOfAccounts();
		a.getTotals();
	}

}
