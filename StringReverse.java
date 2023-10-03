package org.practice;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any :");
		
		String name = sc.nextLine();
		
		String reversed = "";
		for(int i=0;i<name.length();i++) {
			char letter = name.charAt(i);
			reversed = letter + reversed;
			
		}
		System.out.println(reversed);
		
	

	}

}
