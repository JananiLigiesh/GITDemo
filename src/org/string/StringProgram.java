package org.string;

public class StringProgram {
	
	public static void main(String[] args) {
		
		String a = "Janani ligiesh";
		String b = "Janani";
		String c = "janani";
		String d = "janani@gmail.com";
		
		
		int length = a.length();
		System.out.println(length);
		
		boolean equals = b.equals(c);
		System.out.println(equals);
		
		boolean equal = b.equalsIgnoreCase(c);
		System.out.println(equal);
		
		boolean contains = d.contains("@");
		System.out.println(contains);
		
	
	}

}
