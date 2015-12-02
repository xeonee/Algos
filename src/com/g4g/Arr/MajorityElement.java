package com.g4g.Arr;

// Moore’s Voting Algorithm

public class MajorityElement {
	
	public static void main(String[] args) {
		Integer arr[] = {2,2,2,3,3,3,3,5,6,3,3};

		// Find the candidate for Majority
		int candidate = findCandidate(arr);

		// Print the candidate if it is Majority
		if(isMajority(arr, candidate)){
			System.out.println(candidate);
		}
		else
			System.out.println("noMajority");
	}

	private static int findCandidate(Integer[] a) {
		int maj_index = 0, count = 1;
		for (int i = 1; i < a.length; i++) {
			if(a[maj_index] == a[i])
				count++;
			else count--;
			if(count == 0){
				maj_index = i;
				count = 1;
			}
		}
		return a[maj_index];
	}

	private static boolean isMajority(Integer[] arr, int candidate) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == candidate)
				count++;
		}

		if(count > arr.length/2)
			return true;
		return false;
	}

}


