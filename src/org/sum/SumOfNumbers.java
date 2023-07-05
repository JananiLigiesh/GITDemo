package org.sum;

import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("First number");
		int a = s.nextInt();
		System.out.println("First no. "+a);
		
		System.out.println("Second number");
		int b = s.nextInt();
		System.out.println("Second no. " +b);
		
		System.out.println("Product");
		int result= a+b;
		System.out.println("Product " +result);
		
		
	}
}