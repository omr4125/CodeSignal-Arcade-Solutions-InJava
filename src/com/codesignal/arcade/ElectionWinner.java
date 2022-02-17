package com.codesignal.arcade;

import java.util.Arrays;

public class ElectionWinner {

	public static void main(String[] args) {
		int[] votes = {2, 3, 5, 2};
		System.out.println(solution(votes, 3));
	}
	
	static int solution(int[] votes, int k) {
		int counter = 0;
		Arrays.sort(votes);
		for (int i = 0; i < votes.length; i++) {
			if (k == 0 && votes[votes.length-1] > votes[votes.length-2] ) {
				return 1;
			}
			if (votes[i] + k > votes[votes.length-1] ) {
				counter++;
			}
		}
		return counter;
	}
}
