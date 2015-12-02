package com.prac.Arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
public static void main(String[] args) {
	List<Integer> arr = new ArrayList<Integer>();
	Integer[] arrr = { 14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35 };
	arr  = Arrays.asList(arrr);
	System.out.println(rotateArray(arr, 56));
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
}
