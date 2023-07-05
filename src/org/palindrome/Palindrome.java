package org.palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s , rev ="";
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the value");
		
		s = a.nextLine();
		
		int length = s.length();	
		for (int i = length-1; i >=0; i--) {	
		
		rev = rev +s.charAt(i);
		}
		if (s.equals(rev)) 
		System.out.println("It is palindrome");
		
		else
			System.out.println("It is not palindrome");
		
		
			
		}
		
			
		}
	


