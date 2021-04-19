package lab4;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;

	
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdrawl(double amount) {
		if(balance-amount >=0) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient amount");
		}
		
	}


	public double getBalance() {
		return balance;
	}
//Getter Setters
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
