package com.codesignal.arcade;

import java.util.Iterator;

public class ChessKnight {

	public static void main(String[] args) {
		int[][] chess =  new int[8][8];
		String cell = "c2";
		solution(cell);
	}
	
	public static int solution(String cell) {
		int j = (char)cell.toLowerCase().charAt(0) - 97;
		int i = 8 - Integer.valueOf(cell.substring(1));
		System.out.println(i + " " + j);
		int counter = 0;
		if (i-2>=0 && j-1 >=0) counter++;
		if (i-2>=0 && j+1 <= 7) counter++;
		if (i-1>=0 && j-2 >=0) counter++;
		if (i-1>=0 && j+2 <=7) counter++;
		if (i+2<=7 && j-1 >=0) counter++;
		if (i+2<=7 && j+1 <=7) counter++;
		if (i+1<=7 && j-2 >=0) counter++;
		if (i+1<=7 && j+2 <=7) counter++;
		
		System.out.println(counter);
		
		return 0;
	}
}
