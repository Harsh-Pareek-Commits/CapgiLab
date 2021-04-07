package Lab1;

import java.util.*;

public class prime {
	public static void main(String[] args) {

		int num, flag = 0;
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					flag = 1;
			}

			if (flag == 0)

				System.out.print(i+"\t");

		}

	}

}
