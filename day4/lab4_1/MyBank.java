package lab4;

import java.util.Scanner;

public class MyBank {
	private long accNum = 10000;

	public static void main(String[] args) {
		MyBank bank = new MyBank();
		String name;
		float age;
		double amount;
		/*
		 * System.out.println("Enter holder name"); Scanner sc = new Scanner(System.in);
		 * name = sc.nextLine(); System.out.println("Enter holder's age"); age =
		 * Float.parseFloat(sc.nextLine());
		 */
		Person p1 = new Person("Smith", 25);
		Account ac1 = new Account(bank.genAccNum(),2000, p1);
		
		Person p2 = new Person("Kathy", 35);
		Account ac2 = new Account(bank.genAccNum(),3000, p2);
		
		ac1.withdrawl(2000);
		System.out.println("Remaining Balance: "+ ac1.getBalance());
		
		ac2.withdrawl(2000);
		System.out.println("Remaining Balance: "+ ac2.getBalance());
		
		Person p3 = new Person("harsh", 25);
		Account sac1 = new Savings(bank.genAccNum(),2000, p3);
		
		sac1.withdrawl(2000);
		System.out.println("Remaining Balance: "+ sac1.getBalance());
	}

	public long genAccNum() {
		this.accNum++;
		return this.accNum;
	}
}
