package com.g4g.Arr;

public class ReverseArray {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6};
		reverse(a, 0, a.length-1);
		for(int n : a)
			System.out.print(n+" ");
	}

	private static void reverse(int[] a, int start, int end) {
		int temp = 0;
		if(start>= end)
			return;

		temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		reverse(a, start+1, end-1);

	}
}
