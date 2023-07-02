package com.prowings.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class FindCommonElements2 {

	public static void main(String[] args) {

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

		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(2);
		al3.add(32);
		al3.add(5);
		al3.add(12);

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list.add(al1);
		list.add(al2);
		list.add(al3);

		System.out.println(list);

		Iterator<ArrayList<Integer>> itr = list.iterator();

		while (itr.hasNext()) 
		{
			Iterator<Integer> itrElem = itr.next().iterator();
			
			while (itrElem.hasNext()) 
			{
				System.out.println(itrElem.next());
			}
		
//			System.out.println(itr.next());
		}
	}
}