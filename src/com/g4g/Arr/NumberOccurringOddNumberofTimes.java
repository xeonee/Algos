package com.g4g.Arr;

public class NumberOccurringOddNumberofTimes {

	public static void main(String[] args) {
		Integer[] arr = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
				result = result ^ arr[i];
		}
		System.out.println(result);

	}

}
