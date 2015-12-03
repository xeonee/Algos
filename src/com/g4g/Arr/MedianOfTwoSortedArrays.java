package com.g4g.Arr;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
				int ar1[] = {1, 12, 15, 26, 38};
			    int ar2[] = {2, 13, 17, 30, 45};
//		int ar1[] = {1,3,5,7,9};
//		int ar2[] = {13,14,16,19,21};
		int n1 = ar1.length;
		int n2 = ar2.length;
		if (n1 == n2)
			System.out.println("Median is: "+ getMedian2(ar1, ar2, n1));
		else
			System.out.println("Doesn't work for arrays of unequal size");
	}

	/* This function returns median of ar1[] and ar2[].
	   Assumptions in this function:
	   Both ar1[] and ar2[] are sorted arrays
	   Both have n elements */
	public static int getMedian1(int ar1[], int ar2[], int n)	{
		int i = 0;  /* Current index of i/p array ar1[] */
		int j = 0; /* Current index of i/p array ar2[] */
		int count;
		int m1 = -1, m2 = -1;

		/* Since there are 2n elements, median will be average
	        of elements at index n-1 and n in the array obtained after
	        merging ar1 and ar2 */
		for (count = 0; count <= n; count++)
		{
			/*Below is to handle case where all elements of ar1[] are
	             smaller than smallest(or first) element of ar2[]*/
			if (i == n)
			{
				m1 = m2;
				m2 = ar2[0];
				break;
			}

			/*Below is to handle case where all elements of ar2[] are
	             smaller than smallest(or first) element of ar1[]*/
			else if (j == n)
			{
				m1 = m2;
				m2 = ar1[0];
				break;
			}

			if (ar1[i] < ar2[j])
			{
				m1 = m2;  /* Store the prev median */
				m2 = ar1[i];
				i++;
			}
			else
			{
				m1 = m2;  /* Store the prev median */
				m2 = ar2[j];
				j++;
			}
		}

		return (m1 + m2)/2;
	}

	/* This function returns median of ar1[] and ar2[].
	   Assumptions in this function:
	   Both ar1[] and ar2[] are sorted arrays
	   Both have n elements */
	public static int getMedian2(int ar1[], int ar2[], int n){
		int m1; /* For median of ar1 */
		int m2; /* For median of ar2 */

		/* return -1  for invalid input */
		if (n <= 0)
			return -1;

		if (n == 1)
			return (ar1[0] + ar2[0])/2;

		if (n == 2)
			return (Math.max(ar1[0], ar2[0]) + Math.min(ar1[1], ar2[1])) / 2;

		m1 = median(ar1, n); /* get the median of the first array */
		m2 = median(ar2, n); /* get the median of the second array */

		/* If medians are equal then return either m1 or m2 */
		if (m1 == m2)
			return m1;

		/* if m1 < m2 then median must exist in ar1[m1....] and ar2[....m2] */
		if (m1 < m2)
		{
			if (n % 2 == 0){
				ar1 = Arrays.copyOfRange(ar1, n/2 - 1, ar1.length);
				ar2 = Arrays.copyOfRange(ar2, 0, n/2 - 1);
				return getMedian2(ar1, ar2, n - n/2 +1);
			}
			else {
				ar1 = Arrays.copyOfRange(ar1, n/2, ar1.length);
				ar2 = Arrays.copyOfRange(ar2, 0, n/2+1);
				return getMedian2(ar1, ar2, n - n/2);
			}
				
		}

		/* if m1 > m2 then median must exist in ar1[....m1] and ar2[m2...] */
		else
		{
			if (n % 2 == 0){
				ar1 = Arrays.copyOfRange(ar1, 0, n/2 + 1);
				ar2 = Arrays.copyOfRange(ar2, n/2, ar2.length);
				return getMedian2(ar1, ar2, n - n/2 + 1);
			}
				
			else{
				ar1 = Arrays.copyOfRange(ar1, 0, n/2+1);
				ar2 = Arrays.copyOfRange(ar2, n/2, ar2.length);
				return getMedian2(ar1, ar2, n - n/2);
			}
				
		}
	}
	
	public static int median(int arr[], int n)
	{
	    if (n%2 == 0)
	        return (arr[n/2] + arr[n/2-1])/2;
	    else
	        return arr[n/2];
	}
}
