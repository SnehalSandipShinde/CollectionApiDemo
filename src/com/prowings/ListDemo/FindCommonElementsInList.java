package com.prowings.ListDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCommonElementsInList 
{
	
	public static void main(String[] args) 
	{
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
		al3.add("Rukmini");
		al3.add("Sita");

		ArrayList<ArrayList<String>> list = new ArrayList<>();
		list.add(al1);
		list.add(al2);
		list.add(al3);

		System.out.println(list);
		
		HashSet<String> hs = new HashSet<>();

		System.out.println(hs);
	}
}
