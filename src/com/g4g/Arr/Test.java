package com.g4g.Arr;

public class Test {
	public static void main(String[] args) {

		int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};

		int size = mPlusN.length;
		int i = 0, j = size - 1;
		for (i = size-1; i >= 0; i--){
			if (mPlusN[i] != -1)
			{
				mPlusN[j] = mPlusN[i];
				j--;
			}
		}
		
		for(int n:mPlusN){
			System.out.print(n+" ");
		}
	}
}
