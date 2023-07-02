package com.prowings.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateListOfList {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Krishna");
		al1.add("Ram");
		al1.add("Narshimha");
		al1.add("Vaman");

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Balram");
		al2.add("Laxman");
		al2.add("Narayan");
		al2.add("Hari");

		ArrayList<String> al3 = new ArrayList<>();
		al3.add("Laxmi");
		al3.add("Radha");
		al3.add("Rukmini");
		al3.add("Sita");

		ArrayList<ArrayList<String>> list = new ArrayList<>();
		list.add(al1);
		list.add(al2);
		list.add(al3);

		System.out.println(list);

//		Iterator<ArrayList<String>> itr = list.iterator();
//		
//		while(itr.hasNext())
//		{
//			Iterator<String> itrString = itr.next().iterator();
//			
//			while(itrString.hasNext())
//			{
//				System.out.println(itrString.next());
//			}
//		}
	//Second way of iterating list of list
		
		for(ArrayList<String> listElement : list)
		{
			System.out.println("One element in list: \t"+listElement);
			
			Iterator<String> itr = listElement.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}