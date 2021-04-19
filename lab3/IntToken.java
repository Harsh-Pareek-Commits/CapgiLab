package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntToken {
public static void main(String[] args) {
	int sum=0;
	System.out.println("Enter all th integers values: ");
	Scanner sc=new Scanner(System.in);
	 StringTokenizer str = new StringTokenizer(sc.nextLine(), " ");
        while (str.hasMoreTokens()) {
        	int num = Integer.parseInt(str.nextToken());
        
        	System.out.println(num);
          sum+=(num);
        }
        System.out.println("Sum="+sum);
}
}
