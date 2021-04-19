package lab4.lab4_3;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {

		while (true) {
			System.out.println("\nSelect from the menu6 below\n" + "1) Add a book\n" + "2)Add a Journal\n"
					+ "3)Add a CD\n" + "4)Add Video\n" + "Enter your choice:-");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch (ch) {
			case 1:

				new MainRunner().insertLib(new Books());
				break;
			case 2:
				new MainRunner().insertLib(new Journal());
				break;

			case 3:
				new MainRunner().insertLib(new CDs());
				break;
			case 4:
				new MainRunner().insertLib(new Videos());
				break;

			}
		}
	}

	public void insertLib(Item i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UID:");
		int uid = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Title:");
		String tit = sc.nextLine();
		System.out.println("Enter Number of copies:");
		int no_c = Integer.parseInt(sc.nextLine());
		if (i instanceof WrittenItem) {
			System.out.println("Enter the author name:");
			String author = sc.nextLine();
			if (i instanceof Books) {
				Books bk = (Books) i;
				bk.additem(uid, tit, no_c, author);
			}

			else if (i instanceof Journal) {
				System.out.println("Enter the publication year(YYYY)=");
				String yr = sc.nextLine();
				Journal j = (Journal) i;
				j.additem(uid, tit, no_c, yr);
			}

		}
		if (i instanceof MediaItem) {
			System.out.println("Enter the genre:");
			String genre = sc.nextLine();
			System.out.println("Enter the runtime:");
			int run = Integer.parseInt(sc.nextLine());

			if (i instanceof CDs) {
				System.out.println("Enter the artist name:");
				String artist = sc.nextLine();
				CDs cd = (CDs) i;
				cd.additem(uid, tit, no_c, run, artist, genre);
			} else if (i instanceof Videos) {
				System.out.println("Enter the director: ");
				String dir = sc.nextLine();
				System.out.println("Enter the released year(YYYY)=");
				String yr = sc.nextLine();
				Videos v = (Videos) i;
				v.additem(uid, tit, no_c, run, dir, genre, yr);
			}
		}
		i.print(i);
	}
}
