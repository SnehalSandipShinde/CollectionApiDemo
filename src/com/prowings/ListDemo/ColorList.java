package com.prowings.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorList {

	public static void main(String[] args) {
		String[] color = {"red","green","blue","yellow"};
		ArrayList<String> clr = new ArrayList<>();
		
		for(int i=0; i<color.length; i++) {
			clr.add(color[i]);
		}
		System.out.println(clr);
		
		Iterator<String> itr = clr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		clr.add(0, "white");
		
		System.out.println("add color at the first position:- "+clr);
		
		System.out.println("display color at given index:- "+ clr.get(2));
		
		clr.set(2,"orange");
		
		System.out.println("After updating :- "+clr);
		
		clr.remove(3);
		
		System.out.println("After removing :- "+clr);
		
		System.out.println("find an element");
		
		if(clr.contains("red"))
		{
			System.out.println("get the element");
		}
		else
		{
			System.out.println("not get the element");
		}
		
	}
}
