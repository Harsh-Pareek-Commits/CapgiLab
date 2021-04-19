package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Consonant {
public static void main(String[] args) {
	String str=new String();
	System.out.println("Enter the string:");
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	System.out.println(alterString(str));
}
public static String alterString(String s) {
	char str;
	int flag=0;
	String[] v= {"A","E","I","O","U"};
	String new_str="";
	for(int i=0;i<s.length();i++) {
		str=s.charAt(i);
       for(String ch:v) {
    	
    	   if((ch.equals(Character.toString(str)))||(ch.toLowerCase().equals(Character.toString(str)))) {
    		
    		   flag=1;
    		   break;
    	   }else {
    		  
    	   }
   
    	   }
       if(flag==0) {
    	   str++;
    	 
       }
       flag=0;
       new_str=new_str + str;
	}
     return new_str; 
}

}
