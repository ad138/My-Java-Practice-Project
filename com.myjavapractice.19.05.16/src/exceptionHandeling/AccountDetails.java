package exceptionHandeling;

public class AccountDetails {
	double balance;
	
	public void deposite (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) throws MyOwnExceptionClass {
		if (amount <= balance) {
			balance -= amount;
		} else { 
			double amountNeeded = amount - balance;
			throw new MyOwnExceptionClass ("Insufficient Balance");
		}
	}
}
