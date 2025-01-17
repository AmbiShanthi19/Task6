

package task6;

public class AccountMain {

	public static void main(String[] args) {
		
		Account Ac1=new Account();
		Account Ac2=new Account("Acc3456",4678);
		Ac1.deposit(1000); //Deposit 1000 in Ac1
		System.out.println("Balance after deposting in ACC1234 is " + Ac1.getBalance());
		Ac1.withdraw(200.0); //Withdraw 200 in Ac1
		System.out.println("Balance after withdrawing in ACC1234 is "  + Ac1.getBalance());
		Ac2.deposit(500.0); //Deposit 500 in Ac2

		System.out.println("Balance after deposting in Acc3456 is " + Ac2.getBalance());
		Ac2.withdraw(250.0); //Withdraw 250 in Ac2
		System.out.println("Balance after withdrawing in Acc3456 is "  + Ac2.getBalance());
	
	}

}
