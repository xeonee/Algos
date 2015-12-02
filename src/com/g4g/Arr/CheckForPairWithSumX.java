package com.g4g.Arr;

import java.util.HashMap;
import java.util.Map;

public class CheckForPairWithSumX {

	public static void main(String[] args) {
		Integer arr[] = {-2,3,5,8,2,7,9,12,31,56};
		int sum = 10;

		findPair(arr, sum);
	}

	private static void findPair(Integer[] arr, int sum) {
		Map<Integer, Integer> store = new HashMap<Integer, Integer>();

		for (int i = -2; i < 10000; i++) {
			    store.put(i, 0);
//				store.put(arr[i], 0);
		}
		

		int diff = 0;
		for (int i = 0; i < arr.length; i++) {
			diff = sum - arr[i];
			if(!store.isEmpty() && store.get(diff) == 1){
				System.out.println("Pair: "+diff+" "+arr[i]);
			}
			store.put(arr[i], 1);
		}
	}

}
