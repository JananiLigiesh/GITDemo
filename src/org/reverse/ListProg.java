package org.reverse;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListProg {
	
	public static void main(String[] args) {
       // List<Integer> m = new LinkedList<Integer>();
		List m = new LinkedList();
		
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(5);
		
		System.out.println(m);
		
		//for (int i = 0; i < m.size(); i++) {
			//System.out.println(m.get(i));
			
			
			Collections.reverse(m);
			System.out.println(m);
		}
			
		}
	


