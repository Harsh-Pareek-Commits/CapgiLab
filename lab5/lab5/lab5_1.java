package lab5;

import java.util.Scanner;

public class lab5_1 {
	public static void main(String[] args) {
		System.out.println("Enter the age: ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age<15) {
				 throw new InvalidAge("YOU ARE UNDER AGE");  
			}
		}
		catch(Exception ex){
			System.out.println("EXCEPTION: "+ex);
		}
	}
}
class InvalidAge extends Exception{  
	 InvalidAge(String s){  
	  super(s);  
	 }  
	}  