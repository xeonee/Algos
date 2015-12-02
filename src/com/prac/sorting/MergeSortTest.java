package com.prac.sorting;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {
	private int[] numbers;
	private final static int SIZE = 7;
	private final static int MAX = 20;

	@Before
	public void setUp() throws Exception {
		numbers = new int[SIZE];
		Random generator = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = generator.nextInt(MAX);
		}
	}
	
	@Test
	  public void testMergeSort() {
	    long startTime = System.currentTimeMillis();

	    MergeSort sorter = new MergeSort();
	    sorter.sort(numbers, 0, numbers.length);

	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Mergesort " + elapsedTime);

	    for (int i = 0; i < numbers.length - 1; i++) {
	      if (numbers[i] > numbers[i + 1]) {
	        fail("Should not happen");
	      }
	    }
	    assertTrue(true);

	  }

}
