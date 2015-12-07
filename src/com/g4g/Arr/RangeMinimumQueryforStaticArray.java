package com.g4g.Arr;

public class RangeMinimumQueryforStaticArray {
	
	public static void main(String[] args) {
		int a[] = {7, 2, 3, 0, 5, 10, 3, 12, 18};
		int q[][] = {{0, 4}, {4, 7}, {7, 8}};
		int[][]  lookup = new int[a.length][a.length];
		RMQ(a, q, lookup);
	}

	// Prints minimum of given m query ranges in arr[0..n-1]
	private static void RMQ(int arr[], int q[][], int lookup[][])	{
		// Fill lookup table for all possible input queries
		preprocess(arr, lookup);
        int m = q.length;
		// One by one compute sum of all queries
		for (int i=0; i<m; i++)
		{
			// Left and right boundaries of current range
			int L = q[i][0], R = q[i][1];

			// Print sum of current query range
			System.out.println("Minimum of [" + L + ", " + R + "] is "  + arr[lookup[L][R]]);
		}
	}	

	// Fills lookup array lookup[n][n] for all possible values of query ranges
	public static void preprocess(int arr[], int lookup[][]) {
		int n = arr.length;
		// Initialize lookup[][] for the intervals with length 1
		for (int i = 0; i < n; i++)
			lookup[i][i] = i;

		// Fill rest of the entries in bottom up manner
		for (int i=0; i<n; i++)
		{
			for (int j = i+1; j<n; j++)

				// To find minimum of [0,4], we compare minimum of
				// arr[lookup[0][3]] with arr[4].
				if (arr[lookup[i][j - 1]] < arr[j])
					lookup[i][j] = lookup[i][j - 1];
				else
					lookup[i][j] = j;
		}
	}

}


