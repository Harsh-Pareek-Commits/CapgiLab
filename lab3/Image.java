package lab3;

import java.util.Scanner;

public class Image {
public static void main(String[] args) {
	System.out.println("Enter the string");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(str+"|"+getImage(str));
}
public static StringBuffer getImage(String str) {
	StringBuffer sb=new StringBuffer(str);
	return sb.reverse();

}
}
