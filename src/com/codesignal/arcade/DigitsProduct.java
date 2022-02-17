package com.codesignal.arcade;

public class DigitsProduct {

	public static void main(String[] args) {
		System.out.println(solution(19));
	}
	
	public static int  solution(int product) {
		int mltply = 0;
		int i =9;
		while (i < Integer.MAX_VALUE) {
			String s = "" + i;
			mltply = s.chars().map(m -> m-48).reduce(1, Math::multiplyExact);
			System.out.println(s);
			i++;
			if(product == mltply) break;
		}

		return mltply == product ? i-1 : -1;
	}
}
