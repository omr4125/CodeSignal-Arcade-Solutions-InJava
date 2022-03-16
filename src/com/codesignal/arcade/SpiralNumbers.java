package com.codesignal.arcade;

public class SpiralNumbers {

	public static void main(String[] args) {
		int nRow = 5, nCol = 5;
		int value = 1, startRow = 0, startCol = 0;
		int[][] matrix = new int[nRow][nCol];
		//https://www.geeksforgeeks.org/circular-matrix-construct-a-matrix-with-numbers-1-to-mn-in-spiral-way/
		while (startRow < nRow && startCol < nCol) {
			//first row
			for (int i = startCol; i < nRow ; i++) {
				matrix[startRow][i] = value;
				value++;
			}
			startRow++;
			//last col
			for (int i = startRow; i < nRow; i++) {
				matrix[i][nCol-1] = value;
				value++;
			}
			nCol--;
			//last row
			if (startRow < nRow) {
				for (int i = nCol - 1; i >= startCol; --i) {
					matrix[nRow - 1][i] = value;
					value++;
				}
				nRow--;
			}
			//firs col
			if (startCol < nCol) {
				for (int i = nRow - 1; i >= startRow; --i) {
					matrix[i][startCol] = value;
					value++;
				}
				startCol++;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "     ");
			}
			System.out.println("");
		}
	}
}
