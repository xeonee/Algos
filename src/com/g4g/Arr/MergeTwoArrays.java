package com.g4g.Arr;

public class MergeTwoArrays {
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
	
	public void merge(int[] mPlusN, int[] N, int m, int n ){
		// we need 3 pointers, 1 for starting of mPlusN, 1 for N and 1 for output of mPlusN.
		int i = n;
		int j = 0;
		int k = 0;
		
		while(k < m+n){
			if(i<m+n && mPlusN[i]<=N[j] || (j==n)){
				mPlusN[k] = mPlusN[i];
				i++; k++;
			}
			else{
				mPlusN[k] = N[j];
				j++; k++;
			}
		}
	}
}
