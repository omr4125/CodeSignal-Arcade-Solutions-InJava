package com.codesignal.arcade;

import java.util.Arrays;

public class AvoidObstacles {
	
	public static void main(String[] args) {
		
		int[] inputArray = {5, 3, 6, 7, 9};
		
		Arrays.sort(inputArray);
		int j = 2;
		int k = 0;
		boolean b = true;
		while (b) {
			for (int i = 0; i < inputArray.length; i++) {

				if (inputArray[i] % j == 0) {					
					break;				
				}else {
					k++;
				}				
			}		
			j++;
			if (k == inputArray.length) {
				break;
			}
			k = 0;
		}
		System.out.println(j);
}}
