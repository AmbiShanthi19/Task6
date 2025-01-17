

package task6;

public class Account {
	private String AccNum;
	private double balance;
	
	public Account() //Constructors without arguments
	{
		String Acn ="ACC1234";
		double bal=4567;
		this.AccNum=Acn;
		this.balance=bal;
	}
	public Account(String Acn, double bal) //constructors with arguments
	{
		this.AccNum=Acn;
		this.balance=bal;
	}
    // Method to deposit an amount into the account
	    public void deposit(double amount) {
	        // Increase the balance by the deposit amount
	        balance += amount;
	    }

	    // Method to withdraw an amount from the account
	    public void withdraw(double amount) {
	        // Check if the balance is sufficient for the withdrawal
	        if (balance >= amount) {
	            // Decrease the balance by the withdrawal amount
	            balance -= amount;
	        } else {
	            // Print a message if the balance is insufficient
	            System.out.println("Insufficient balance");
	        }
	    }

	    // Method to get the current balance
	    public double getBalance() {
	        // Return the current balance
	        return balance;
	    }
	} 
