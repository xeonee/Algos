package com.prac.Arr;

import java.util.ArrayList;
import java.util.List;

public class SpiralArray {
public static void main(String[] args) {
	List<ArrayList<Integer>> itemList = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> intList = new ArrayList<Integer>();
	ArrayList<Integer> intList1 = new ArrayList<Integer>();
	ArrayList<Integer> intList2 = new ArrayList<Integer>();

	int[] ints = {1, 2, 3};
	for (int i : ints) 
		intList.add(i); itemList.add(intList); 
	int[] ints1 = {4, 5, 6};
	for (int i : ints1) 
		intList1.add(i); itemList.add(intList1);
	int[] ints2 = {7, 8, 9};
	for (int i : ints2) 
		intList2.add(i); itemList.add(intList2);
	
	System.out.println(spiralOrder(itemList));
}
	
public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
	 ArrayList<Integer> result = new ArrayList<Integer>();
	 int m = a.size(); int n = a.get(0).size();
	 int T = 0, B = m-1, L = 0, R = n-1, dir = 0;
	 
	 while (T<=B && L<=R){
		 if(dir == 0){
			 for (int i = L; i <= R ; i++) 
				result.add(a.get(T).get(i));
				T++;
		 }
		 else if(dir == 1){
			 for(int i = T; i<=B; i++)
				 result.add(a.get(i).get(R));
			 R--;
		 }
		 else if(dir == 2){
			 for(int i = R; i>=L; i--)
				 result.add(a.get(B).get(i));
			 B--;
		 }
		 else if(dir == 3){
			 for(int i = B; i>=T; i--)
				 result.add(a.get(i).get(L));
			 L++;
		 }
		 dir = (dir+1)%4;
	 }
	 
	 
	 // Populate result;
	 return result;
}
}
