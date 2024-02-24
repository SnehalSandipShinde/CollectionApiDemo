package com.prowings.ListDemo;

public class FindIndexPositionCopy {

	
	public int getIndex(int[] arr, int value)
	{
		if(arr == null) {
			System.out.println("you entered the null array");
			return -1;
		}
		
		int i ;
		int len = arr.length;
		
		for(i = 0; i<len;i++)
		{
			if(arr[i] == value) {
				return i;
			}
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) 
	{
		
//		int[] arr = {12,10};
//		int[] arr = {10,10};
		int[] arr = {10};
//		int[] arr = {};
//		int[] arr = null;
		
		FindIndexPositionCopy getIndex = new FindIndexPositionCopy();
		

		System.out.println("Index position of entered value is:- "+getIndex.getIndex(arr, 10));
	}
}
