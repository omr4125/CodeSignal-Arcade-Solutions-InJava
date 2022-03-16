package com.codesignal.arcade;

public class MAC48Address {

	public static void main(String[] args) {
		System.out.println(solution("00-1B-63-84-45-E6"));
	}
	static boolean solution(String inputString) {
		if(inputString.length() != 17) return false;
		String[] strMac = inputString.split("-");
		if (strMac.length == 6) {
			for (int i = 0; i < strMac.length; i++) {
				String s = strMac[i].replaceAll("[A-F0-9]", "");
				if (s.length() != 0) return false;
			}
		}else return false;
		return true;
	}
}
