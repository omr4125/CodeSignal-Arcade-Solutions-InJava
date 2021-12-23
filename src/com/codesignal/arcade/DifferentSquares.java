package com.codesignal.arcade;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquares {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		int[][]matrix =  {{1, 2, 1},
						  {2, 2, 2},
						  {2, 2, 2},
						  {1, 2, 3},
						  {2, 2, 1}};
		
		for (int i = 0; i < matrix.length-1; i++) {
			for (int j = 0; j < matrix[i].length-1; j++) {
				set.add( ""+matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1]);
			}		
		}
		System.out.println(set);
		System.out.println(set.size());
	}
}
