package com.codesignal.arcade;

import java.util.Arrays;

public class SimilarInTwoArrays {

	public static void main(String[] args) {
		int[] idx = new int[2];
		int counter = 0;
		
		int[] a = {1, 2, 3};
		int[] b = {1, 10, 2};

		
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				idx[counter] = i;
				counter++;
			}
			if (counter == 2) break; 
		}
		b[idx[0]] = b[idx[0]] + b[idx[1]];
		b[idx[1]] = b[idx[0]] - b[idx[1]];
		b[idx[0]] = b[idx[0]] - b[idx[1]];
		
		System.out.println(Arrays.equals(a, b));

		//Solution by trinhnguyen at codesignal
		
//		int rs = 0, s1 = 1, s2 = 1;
//	    for (int i = 0; i < a.length; i++) {
//	        if (a[i] != b[i])
//	            rs++;
//	        s1 *= a[i];
//	        s2 *= b[i];
//	    }
//	    return rs <= 2 && s1 == s2;
		
		//solution by bandorthild
//		int sum = 0;
//	    for (int i = 0; i < a.length; i++) {if (a[i] != b[i]) {sum++;}}
//	    Arrays.sort(a);
//	    Arrays.sort(b);
//	    return Arrays.equals(a, b) && sum < 3;}

	}

}

