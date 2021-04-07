package Lab1;

import java.util.Scanner;

public class fibo {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number:");
		num = sc.nextInt();
		System.out.println("Printing the Fibonacci sequence using non-recursive functions ");
		nonRecursive(num);
		System.out.println("\nPrinting the Fibonacci sequence using recursive functions ");
		 for (int i = 1; i <= num; i++) {
		System.out.print(recursive(i)+"\t");
		 }
		 }

	public static void nonRecursive(int n) {
		int x1 = 1;
		int x2 = 1;
		int x3;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print("1\t");
			} else if (i == 2) {
				System.out.print("1\t");
			} else if (i > 2) {
				x3 = x2 + x1;
				x1 = x2;
				x2 = x3;
				System.out.print(x3 + "\t");

			}
		}
	}

	public static int recursive(int n) {

		if (n <= 1)
			return n;
		return recursive(n - 1) + recursive(n - 2);

	}
}
