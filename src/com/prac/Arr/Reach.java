package com.prac.Arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reach {
public static void main(String[] args) {
	List<Integer> X = new ArrayList<Integer>();
	Integer[] arrr1 = { 4, 8, -7, -5, -13, 9, -7, 8 };
//	Integer[] arrr1 = {0,1,1};
	X  = Arrays.asList(arrr1);
	
	List<Integer> Y = new ArrayList<Integer>();
	Integer[] arrr2 = {4, -15, -10, -3, -13, 12, 8, -8 };
//	Integer[] arrr2 = {0,1,2};
	Y  = Arrays.asList(arrr2);
	
	System.out.println(coverPoints(X,Y));
}
	
// X and Y co-ordinates of the points in order.
// Each point is represented by (X.get(i), Y.get(i))
    public static int coverPoints(List<Integer> X, List<Integer> Y) {
    	int reach=0;
    	
    	for (int i = 1; i < X.size(); i++) {
    		reach = reach +distance(X.get(i-1), X.get(i), Y.get(i-1), Y.get(i));
		}
    	
    	return reach;
    }
    
      
    public static int distance(int x1, int x2, int y1, int y2){
    	int dist = Math.max(Math.abs(x1-x2), Math.abs(y1-y2));
    	return (dist);
    }
}
