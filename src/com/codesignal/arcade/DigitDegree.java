package com.codesignal.arcade;

public class DigitDegree {
	
	public static void main(String[] args) {
		System.out.println(solution(91));
	}
	static int solution(int n) {
		int count = 0;
		while ((n+"").length() != 1) {
			count++;
			int sum = 0;
			for (int i = 0; i < (n+"").length(); i++) {
				sum += (n+"").charAt(i) - '0';
			}
			n = sum;
		}
        return count;
	}
}