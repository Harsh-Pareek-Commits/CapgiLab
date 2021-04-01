package Lab1;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		sum = getCubeSum(num);
		System.out.println("Sum=" + sum);
	}

	public static int getCubeSum(int n) {
		int x, sum = 0;
		while (n > 0) {
			x = n % 10;
			n = n / 10;
			sum = sum + (x * x * x);

		}
		return sum;
	}
}
