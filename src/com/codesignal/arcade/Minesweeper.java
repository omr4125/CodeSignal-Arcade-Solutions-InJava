package com.codesignal.arcade;

import java.util.Arrays;

public class Minesweeper {

	public static void main(String[] args) {
		
		boolean[][] matrix = {{false,true,true,false}, 
		                      {true,true,false,true},
		                      {false,false,true,false}
		                      };
		int[][]matrixInt = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == true) {
					matrixInt[i][j] = 1;
				}
			}	
		}
		int[][] minesweeper = Arrays.stream(matrixInt).map(int[]::clone).toArray(int[][]::new);
		System.out.println("-------------");
		System.out.println(Arrays.toString(minesweeper[0]));
		System.out.println(Arrays.toString(minesweeper[1]));
		System.out.println(Arrays.toString(minesweeper[2]));
		System.out.println("----------------");
		System.out.println(Arrays.toString(matrixInt[0]));
		System.out.println(Arrays.toString(matrixInt[1]));
		System.out.println(Arrays.toString(matrixInt[2]));
		int k = 0;
		
		for (int i = 0; i < matrixInt.length; i++) {
			for (int j = 0; j < matrixInt[i].length; j++) {
				
				if (i - 1 < 0) {
					if(j - 1 < 0) {
						minesweeper[i][j] = matrixInt[i+1][j] + matrixInt[i+1][j+1] + matrixInt[i][j+1];
						System.out.print("i:" + i + "j:" + j + "->");
						System.out.print(minesweeper[i][j] + " ");
						
						
					}else if (j + 1 >= matrixInt[i].length) {
						minesweeper[i][j] = matrixInt[i+1][j] + matrixInt[i+1][j-1] + matrixInt[i][j-1];
						System.out.print("i:" + i + "j:" + j + "->");
						System.out.print(minesweeper[i][j] + " ");
						
					}else {
						minesweeper[i][j] = matrixInt[i][j+1] + matrixInt[i+1][j+1] + matrixInt[i+1][j] + matrixInt[i+1][j-1] + matrixInt[i][j-1];
						System.out.print("i:" + i + "j:" + j + "->");
						System.out.print(minesweeper[i][j] + " ");
					}
					
				}else if (i + 1 >= matrixInt.length) {
					if(j - 1 < 0) {
						minesweeper[i][j] = matrixInt[i-1][j] + matrixInt[i-1][j+1] + matrixInt[i][j+1];
						System.out.print(minesweeper[i][j] + " ");
						
					}else if (j + 1 >= matrixInt[i].length) {
						minesweeper[i][j] = matrixInt[i-1][j] + matrixInt[i-1][j-1] + matrixInt[i][j-1];
						System.out.print(minesweeper[i][j]+ " ");
						
					}else {
						minesweeper[i][j] = matrixInt[i][j-1] + matrixInt[i-1][j-1] + matrixInt[i-1][j] + matrixInt[i-1][j+1] + matrixInt[i][j+1];
						System.out.print(minesweeper[i][j] + " ");
						
					}
				}else {
					if (j - 1 < 0) {
						minesweeper[i][j] = matrixInt[i-1][j] + matrixInt[i-1][j+1] + matrixInt[i][j+1] + matrixInt[i+1][j+1] + matrixInt[i+1][j];
						System.out.print(minesweeper[i][j] + " ");
						
					}else if (j + 1 >= matrixInt[i].length) {
						minesweeper[i][j] = matrixInt[i+1][j] + matrixInt[i+1][j-1] + matrixInt[i][j-1] + matrixInt[i-1][j-1] + matrixInt[i-1][j];
						System.out.print(minesweeper[i][j] + " ");
						
					}else {
						minesweeper[i][j] = matrixInt[i-1][j] + matrixInt[i-1][j+1] + matrixInt[i][j+1] + matrixInt[i+1][j+1] + 
								matrixInt[i+1][j] + matrixInt[i+1][j-1] + matrixInt[i][j-1] + matrixInt[i-1][j-1];
						System.out.print(minesweeper[i][j] + " ");
						
					}
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
		System.out.println(Arrays.toString(minesweeper[0]));
		System.out.println(Arrays.toString(minesweeper[1]));
		System.out.println(Arrays.toString(minesweeper[2]));
	}
}
