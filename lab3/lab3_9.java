package lab3;

import java.time.LocalDate;
import java.util.Scanner;

public class lab3_9 {

	public static void main(String[] args) {
		LocalDate now_date;
		now_date = LocalDate.now();
		System.out.println("Enter date in (yyyy-mm-dd) format : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		LocalDate dte = LocalDate.parse(str);

		System.out.println("Difference: " + (Math.abs(now_date.getDayOfMonth() - dte.getDayOfMonth())) + " Days "
				+ (Math.abs(now_date.getMonthValue() - dte.getMonthValue())) + " Months "
				+ (Math.abs(now_date.getYear() - dte.getYear())) + " Years");
	}
}
