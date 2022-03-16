package com.codesignal.arcade;

import java.util.Arrays;

public class SumOfNumbers {

	public static void main(String[] args) {
		System.out.println(solution("there are some (12) digits 5566 in this 770 string 239"));
	}
	static int  solution(String str) {
		String[] s = str.replaceAll("[^0-9]", "-").split("-");
		return Arrays.stream(s)
						.filter(t -> !t.equals(""))
						.map(i -> Integer.valueOf(i))
						.reduce(0, Integer::sum);
	}
}
