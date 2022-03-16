package com.codesignal.arcade;

import java.util.Arrays;
import java.util.Comparator;

public class SortByHeight {
	
	public static void main(String[] args) {
		
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		int alenght = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) 
				alenght++;
		}
		int[] b = new int[alenght];		
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] != -1) {
				b[j] = a[i];
				j++;
			}
		}
		Arrays.sort(b);
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] != -1) {
				a[i] = b[j];
				j++;
			}				
		}
		
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
