package org.arrayprog;

import java.util.ArrayList;
import java.util.List;

public class Array {
	
	public static void main(String[] args) {
		
		List j = new ArrayList();
		
     
		j.add(10);
		j.add(100);
		j.add(200);
		j.add(30);
		j.add(10);
		j.add(70);
     
     
		int size = j.size();
		System.out.println(size);
		
		int s = j.indexOf(10);
		System.out.println(s);
		
		int a = j.lastIndexOf(10);
		System.out.println(a);
		
		Object object = j.get(2);
		System.out.println(object);
	
	//	Object remove = j.remove(3);
	//  System.out.println(remove);
	
		j.add(2,50);
		System.out.println(j);
		
		j.add(7,90);
		System.out.println(j);
		
		
	}
	}

