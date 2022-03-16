package com.codesignal.arcade;

public class PalindromeRearranging {

	public static void main(String[] args) {
		
		String inputString = "abcd";
		System.out.println(solution(inputString));

	}
	static boolean solution(String inputString) {

		int countOfEachChar = 0, countOfOdd = 0;
			for ( char ch = 'a';  ch < 'z'; ch++) {
				char ch2 = ch;
				countOfEachChar = (int) inputString.chars().filter(a -> a == ch2).count();
				if (countOfEachChar % 2 != 0) {
					countOfOdd++;
				}
			}
			return countOfOdd <= 1;
		}
}
