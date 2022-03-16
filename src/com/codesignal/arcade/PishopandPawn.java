package com.codesignal.arcade;

public class PishopandPawn {

	public static void main(String[] args) {
		System.out.println(solution("h1", "h3"));	
	}
	public static boolean solution(String bishop, String pawn) {
		
		int colBis = (char)bishop.toLowerCase().charAt(0) - 97;
		int rowBis = 8 - Integer.valueOf(bishop.substring(1));
		int colPaw = (char)pawn.toLowerCase().charAt(0) - 97;
		int rowPaw = 8 - Integer.valueOf(pawn.substring(1));
		
		if (rowBis-colBis == 0) {
			
		}
		if ( ( Math.abs(rowBis - colBis) == Math.abs(rowPaw - colPaw) ) ||
				( (Math.abs(rowBis - colBis) % 2 == Math.abs(rowPaw - colPaw) % 2)&&(rowBis-colBis != 0) )         
				
				) {
			return true;
		}
		
 		return false;
	}
}
