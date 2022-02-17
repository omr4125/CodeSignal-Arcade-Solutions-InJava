package com.codesignal.arcade;


public class ExtractEachKth {

	public static void main(String[] args) {

		int[] inputArray = {1, 3, 4, 2, 4, 2, 4};
		int sum = 0;
		int max = 0;
		int k = 4;
		for (int i = 0; i <= inputArray.length-k; i++) {
			sum = inputArray[i];
			for (int j = 1; j < k; j++) {
				sum += inputArray[j+i];
			}
			max = Math.max(max, sum);
			sum = 0;
		}
		System.out.println(max);
	}
}
