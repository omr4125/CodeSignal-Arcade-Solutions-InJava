package com.codesignal.arcade;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sudoku {

	public static void main(String[] args) {
		int[][]grid =  {{1, 3, 2, 5, 4, 6, 9, 8, 7},
				        {4, 6, 5, 8, 7, 9, 3, 2, 1},
				        {7, 9, 8, 2, 1, 3, 6, 5, 4},
				        {9, 2, 1, 4, 3, 5, 8, 7, 6},
				        {3, 5, 4, 7, 6, 8, 2, 1, 9},
				        {6, 8, 7, 1, 9, 2, 5, 4, 3},
				        {5, 7, 6, 9, 8, 1, 4, 3, 2},
				        {2, 4, 3, 6, 5, 7, 1, 9, 8},
				        {8, 1, 9, 3, 2, 4, 7, 6, 5}};
			int n = grid.length;
	    
	    Set<Integer> setRow = new LinkedHashSet<>();
	    Set<Integer> setCol = new LinkedHashSet<>();

	    for (int row = 0; row < n ; row++) {
	        for (int col = 0; col < n; col++) {
	        	
	            if (!setRow.add(grid[row][col])) {
					System.out.println("false");
				}
	            if (!setCol.add(grid[col][row])) {
					System.out.println("false");
				}

	        }
	        System.out.println("row"+setRow);
	        System.out.println("col"+setCol);
	        setCol.clear();
	        setRow.clear();
	        
	    } 
	    for (int row = 0 ; row < 9; row = row + 3) {
	    	for (int col = 0; col < 9; col = col + 3) {
	    		Set<Integer> setMatrix = new LinkedHashSet<>();
	    		for(int r = row; r < row+3; r++) {
	    			for(int c= col; c < col+3; c++){
	    				if (!setMatrix.add(grid[r][c])) {
							System.out.println("false");
						}
	    			}
	    		}
	    		System.out.println("matrix"  +setMatrix);
	    	}   	    	
	    }
	}
}
