package lab4;

public class Current extends Account {
double over_draft=15000;

public Current(long accNum, double balance, Person accHolder) {
	super(accNum, balance, accHolder);
	
}
public void withdrawl(double amount) {
	if( amount <= over_draft+this.getBalance())
	{
	   if(amount>this.getBalance()) {
		   amount=amount-this.getBalance();
		   this.setBalance(0);
		   over_draft-=over_draft-amount;
	   }
	   else {
		   super.withdrawl(amount);
	   }
	}else {
		System.out.println("Over draft limit exceeds");
	}
}


}
