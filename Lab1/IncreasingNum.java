package Lab1;

import java.util.*;

public class IncreasingNum {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		 if(checkNumber(num) ) {
		 System.out.println("It is a increasing number"); 
		  }
		 else {
			 System.out.println("It is not a increasing number");
		 }

	}

	public static boolean checkNumber(int num) {
		int temp1, temp2;

		while (num > 0) {
			temp2 = (num / 10)%10;
			temp1 = num % 10;
			
			if (temp2 > temp1) {
				
				return false;
			}
			num = num / 10;
			

		}
		return true;
	}

}
