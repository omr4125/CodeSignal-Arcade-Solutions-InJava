package com.codesignal.arcade;

import java.util.Arrays;

public class AbsoluteValuesSumMinimization {

	public static void main(String[] args) {
		int[] a = {0, 7, 9};
		int[] aa = new int[a.length];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				sum += Math.abs(a[i]- a[j]);
			}
			aa[i] = sum;
			sum = 0;			
		}
		
		System.out.println(Arrays.toString(aa));
		int index = 0;
		int minValue = aa[0]; 
	    for(int i=1;i<aa.length;i++){ 
	      if(aa[i] < minValue){ 
	        minValue = aa[i]; 
	        index = i;
	      } 
	    } 
	    System.out.println(a[index]);
	    
	}
}
