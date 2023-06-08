package com.prowings.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(23);
		al.add(34);
		
		System.out.println(al);
		System.out.println();
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
