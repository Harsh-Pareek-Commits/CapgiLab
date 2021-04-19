package lab3;

import java.util.Scanner;

public class lab3_4 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(modifyNumber(n));
		}
public static StringBuffer modifyNumber(int n) {
	String str = Integer.toString(n);
	StringBuffer s=new StringBuffer();
	for(int i = 0;i < str.length()-1;i++) {
			char num1 = str.charAt(i);
			char num2 = str.charAt(i+1);
			int num3 = (Character.getNumericValue(num1) - Character.getNumericValue(num2));
			s.append(Math.abs(num3));
			
		}
	s.append(Character.getNumericValue(str.charAt(str.length()-1)));
	
	return s;
	}
}
