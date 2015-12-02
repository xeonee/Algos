package com.prac.sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = {17, 8, 2, 6, 6, 19, 8};
		sort(arr, 0, arr.length-1);
		for(int n:arr){
			System.out.print(n+" ");
		}
	}

	public static void sort(int[] arr, int low, int high) {
		if(low < high){
			int mid = (low+high)/2;
			sort(arr, low, mid);
			sort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int[] helper = Arrays.copyOf(arr, arr.length);
		
		int helperLeft = low;
		int helperRight = mid+1;
		int current = low;
		
		while(helperLeft <= mid && helperRight <= high){
			if(helper[helperLeft] <= helper[helperRight]){
				arr[current] = helper[helperLeft];
				helperLeft++;
			}
			else {
				arr[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		} // end while
		
		// copy the rest of the left part
		while(helperLeft <= mid){
			arr[current] = helper[helperLeft];
			helperLeft++;
			current++;
		}
		
	}
	
	
	
}
