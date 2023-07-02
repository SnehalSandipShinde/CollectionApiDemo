package com.prowings.ListDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCommonElements {
	
	
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al1 = new ArrayList<>();
			al1.add(2);
			al1.add(5);
			al1.add(4);
			al1.add(3);
		
		ArrayList<Integer> al2 = new ArrayList<>();
			al2.add(2);
			al2.add(32);
			al2.add(5);
			al2.add(12);
		
			
		HashSet<Integer> commonElem = new HashSet<>();
		
		
		for(Integer element : al1)
		{
			if(al2.contains(element))
				commonElem.add(element);
		}
		System.out.println(commonElem);
	}

}
