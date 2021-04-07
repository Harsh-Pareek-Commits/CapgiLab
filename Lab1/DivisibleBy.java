package Lab1;

import java.util.*;
class Sum{
	public int calculateSum (int n) {
	int sum=0;
    for(int i=0;i<n;i++) {
    	if((i/3==0)||(i/5==0)) {
    		sum+=i;
    	}
    }
		return sum;
	}
}

public class DivisibleBy {
	public static void main(String[] args) {
		int n, sum = 0;
		System.out.println("Please enter the last number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Sum s=new Sum();
       System.out.println("Sum= "+ s.calculateSum(n));
	}
}
