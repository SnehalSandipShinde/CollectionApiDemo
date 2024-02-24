package com.prowings.SetDemo;

/*
 * 
If you have a sorted array containing only 0's and 1's, give me the number of 1's in the array. 
Most optimized is o(log n)

*/
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class OnesArray {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(0, 1, 0, 1, 1);

		List<Integer> list = arr.stream().collect(Collectors.toList());

		TreeMap<Integer, Integer> ts = new TreeMap<>();
		int count = 0;
		for (Integer it : list) {
			if (it == 1)
				ts.put(count++, it);
		}

		System.out.println(ts);

		Set<Integer> set = ts.keySet();

		Iterator<Integer> itr = set.iterator();

//		while (itr.hasNext()) {
////			System.out.println(itr.next());
//			
//			System.out.println(ts.get(itr.next()));
//		}

		Integer[] result = new Integer[ts.size()];
		while (itr.hasNext()) {
			for (int i = 0; i < result.length; i++) {

				result[i] = ts.get(itr.next());
			}

		}

		System.out.println(Arrays.asList(result));

	}

}
