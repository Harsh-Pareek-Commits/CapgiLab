package lab3;

import java.util.Scanner;

public class lab3_5 {
public static void main(String[] args) {
	String[] str2;
	String[] str3;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter strtring : ");
	String str = sc.nextLine();
	int line=0; 
	int words = 0;
    str2=str.split(" ");
    for(String s:str2) {
    	words++;
    }
    str3=str.split("\n");
    for(String s:str2) {
    	line++;
    }
    System.out.println("Lines="+line+" Words="+words);
}
}
