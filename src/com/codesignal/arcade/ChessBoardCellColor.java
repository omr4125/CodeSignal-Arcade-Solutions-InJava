package com.codesignal.arcade;

public class ChessBoardCellColor {

	public static void main(String[] args) {
		
		int[][] chess =  {  {0, 1, 0, 1, 0, 1, 0, 1},
							{1, 0, 1, 0, 1, 0, 1, 0},
							{0, 1, 0, 1, 0, 1, 0, 1},
							{1, 0, 1, 0, 1, 0, 1, 0},
							{0, 1, 0, 1, 0, 1, 0, 1},
							{1, 0, 1, 0, 1, 0, 1, 0},
							{0, 1, 0, 1, 0, 1, 0, 1},
							{1, 0, 1, 0, 1, 0, 1, 0} };
		String cell1 = "A1";
		String cell2 = "C3";
		
		int j = (char)cell1.toLowerCase().charAt(0) - 97;
		
		int i = 8 - Integer.valueOf(cell1.substring(1));
		
		System.out.println(i + " " + j);
		
		int jj = (char)cell2.toLowerCase().charAt(0) - 97;
		
		int ii = 8 - Integer.valueOf(cell2.substring(1));
		
		System.out.println(ii + " " + jj);
		System.out.println(Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2);
	}
}
