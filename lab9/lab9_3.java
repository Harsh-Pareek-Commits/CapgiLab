package lab9;

import java.util.Scanner;
import java.util.function.BiFunction;

public class lab9_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String u_name = sc.next();
		System.out.println("Enter password");
		String pass= sc.next();

		BiFunction<String,String,Boolean>validate= (str1,str2) -> {
			if (str1.equals("Harsh") && str2.equals("Capgi"))
				return true;
			return false;
		};
		if (validate.apply(u_name,pass))
			System.out.println("Valid credentials");
		else
			System.out.println("Invalid credentials");
	}
}
