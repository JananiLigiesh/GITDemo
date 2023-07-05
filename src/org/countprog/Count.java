package org.countprog;

public class Count {
	
	public static void main(String[] args) {
		
		String s = "Java Class @ Greens Technology";
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int numbersCount = 0;
		int spCharCount = 0;
		
		for (int i = 0; i <s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch>='A' && ch<='Z') {
				upperCaseCount++;
			}
			else if (ch>='a' && ch<='z') {
				lowerCaseCount++;
				
			}
			else if (ch>='0' && ch<='9') {
				numbersCount++;	
			}
			else {
				spCharCount++;
			}
				
		}
		
		System.out.println(upperCaseCount);
		System.out.println(lowerCaseCount);
		System.out.println(numbersCount);
		System.out.println(spCharCount);
	}
	


}