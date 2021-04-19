package lab4;

public class Savings extends Account {
	final double MIN_BALANCE = 500;

	public Savings(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
	}
	
	public void withdrawl(double amount) {
		if(this.getBalance() - amount >= MIN_BALANCE)
		{
			super.withdrawl(amount);
		}else {
			System.out.println("Insufficient amount in savings acount");
		}
	}

}
