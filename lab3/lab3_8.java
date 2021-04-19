package lab3;

import java.util.Scanner;

public class lab3_8 {
public static void main(String[] args) {
	String str;
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	if(checkPositive(str)) {
		System.out.println("It is a positive string");
	}else
	{
		System.out.println("It is not a positive string");
	}
}
public static boolean checkPositive(String str) {
	int num=0,flag=0;
	
	for(int i=0;i<str.length();i++) {
		if(num>str.charAt(i)) {
			flag=1;
			break;
		}else {
			num=str.charAt(i);
		}
	}
	if (flag==1)
	return false;
	else
		return true;
	
}
}
