package Lab1;
import java.util.*;
public class Traffic {
	public static void main(String[] args) {
		int choice;
		System.out.println("Selet your choice");
		System.out.println("1) RED LIGHT");
		System.out.println("2) GREEN LIGHT");
		System.out.println("3) YELLOW LIGHT");
		Scanner sc= new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Go");
			break;
		case 3:
			System.out.println("Ready");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}

}
