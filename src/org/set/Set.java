package org.set;



import java.util.LinkedHashSet;



public class Set {
	
public static void main(String[] args) {
	
	LinkedHashSet s = new LinkedHashSet();
	
	
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(90);
	s.add(10);
	s.add(40);
	
	LinkedHashSet d = new LinkedHashSet();
	d.add(10);
	d.add(70);
	d.add(80);
	
	//LinkedHashSet m = new LinkedHashSet();
	
//	m.add(50);
//	m.add(60);
	//m.add(80);
	
	//System.out.println(s.addAll(m));
	
	System.out.println(s.removeAll(d));
	System.out.println(s);
	
	
	// for (Object object : s) {
	//	 System.out.println(object);
		
	}
	
}


