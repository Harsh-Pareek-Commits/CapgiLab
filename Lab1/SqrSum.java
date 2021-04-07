package Lab1;

import java.util.*;
class Cal_Sums {
	private int n;

		public int calculateDifference (int n) {
			int sum1 = 0;
			for (int i = 0; i < n; i++) {
				sum1 =sum1+(i * i);
				
			}
			int sum2 = 0;
			for (int i = 0; i < n; i++) {
				sum2 += i;
			}
			sum2 = sum2 * sum2;
			int dif = sum2-sum1 ;
				return dif;


	}
}
public class SqrSum {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the last number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Cal_Sums sm = new Cal_Sums();
		System.out.println("Diffrence:"+sm.calculateDifference(n));
	}

	
}
