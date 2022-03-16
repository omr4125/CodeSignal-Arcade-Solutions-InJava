package com.codesignal.arcade;

public class IsLucky {

	public static void main(String[] args) {
		System.out.println(solution(0));
	}
	static boolean solution(int n) {
	    int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
		    int N = digits.length / 2, sum = 0;
		    
		    for (int i = 0; i < digits.length; i++) {
				if (i < N) {
					sum += digits[i];
				}else {
					sum -= digits[i];
				}
			}
		    return(sum == 0 ? true : false);
	}

}
