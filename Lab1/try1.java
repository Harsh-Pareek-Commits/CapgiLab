package Lab1;

import java.util.*;

class std {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class try1 {
	public static void main(String[] args) {
		String sname;
		int n = 10;
		std[] s;
		s = new std[10];
		for (int i = 0; i < n; i++) {
			std temp = new std();
			System.out.println("Enter the name: ");
			Scanner sc = new Scanner(System.in);
			sname = sc.nextLine();
			temp.setName(sname);
			s[i]=temp;
			

		}
		for (int i = 0; i < n; i++) {
			System.out.println("\tName=" + s[i].getName() + "\n");
			
		}
	}
}
