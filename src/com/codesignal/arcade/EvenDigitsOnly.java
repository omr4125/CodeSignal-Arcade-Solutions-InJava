package com.codesignal.arcade;

public class EvenDigitsOnly {

	public static void main(String[] args) {
		// Check if all digits of the given integer are even
		int n = 24438042;
		System.out.println(Integer.toString(n).matches("(0|2|4|6|8)*"));
		System.out.println(String.valueOf(n).matches("[02468]+"));

	}

}
