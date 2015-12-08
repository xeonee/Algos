package com.g4g.Arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		int[] arrr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//		arr  = Arrays.asList(arrr);
		leftRotate(arrr, 3);
		printArray(arrr);
//		System.out.println(rotateArray(arr, 56));
		
	}

	public static void leftRotate(int arr[], int d){
		int i, j, k, temp;
		int n = arr.length;
		for (i = 0; i < gcd(d, n); i++)  {
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while(true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}
	public static ArrayList<Integer> rotateArray(List<Integer> arr, int B) {
		B =  B % arr.size();
		System.out.println(B);
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < arr.size()-B; i++) {
			ret.add(arr.get(i + B));
		}
		for (int i = 0; i < B; i++) {
			ret.add(arr.get(i));
		}
		return ret;
	}

	public static int gcd(int a,int b){
		if(b==0)
			return a;
		else
			return gcd(b, a%b);
	}
	
	public static void printArray(int arr[])
	{
		  int i;
		  for(i = 0; i < arr.length; i++)
		    System.out.print(arr[i]+" ");
		}
}
