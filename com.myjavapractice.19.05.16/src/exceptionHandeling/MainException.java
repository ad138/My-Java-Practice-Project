package exceptionHandeling;

public class MainException {
	public static void main(String args[]) {
		AccountDetails accnt = new AccountDetails();
		accnt.deposite(300.00);
		System.out.println("Depositing rs.300.00");
	try {
		//accnt.withdraw(200.00);
		//System.out.println("Withdrawing rs. 200.00");
		System.out.println("Withdrawing rs. 600.00");
		accnt.withdraw(600.00);
	} catch (MyOwnExceptionClass excep) {
		System.out.println(excep.getMessgae());
		excep.printStackTrace();
	}
	}

}
