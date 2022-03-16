package com.codesignal.arcade;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IsCryptSolution {

	public static void main(String[] args) {
		String[]crypt = {"AAAAAAAAAAAAAA", "BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC"};
		char[][]solution = {{'A', '1'},
							{'B', '2'},
							{'C', '3'}
//							{'D', '4'},
							
							};
		System.out.println(solution(crypt, solution));
//		System.out.println(Long.valueOf("33333333333333"));
	}
	
	static boolean solution(String[] crypt, char[][] solution) {
		Map<Character, Character> map = new HashMap<>();
		
		for (int i = 0; i < solution.length; i++) {
			map.put(solution[i][0], solution[i][1]);
		}
		
		for (int i = 0; i < crypt.length; i++) {
			String s = "";
			for (int j = 0; j < crypt[i].length(); j++) {
				 s = s + map.get(crypt[i].charAt(j));
			}
			if(s.startsWith("0") && s.length() > 1) return false;
			crypt[i] = s;
		}
		System.out.println(Arrays.toString(crypt));
		System.out.println(map);
		System.out.println(Long.parseLong(crypt[0]));
		return Long.parseLong(crypt[0]) + Long.parseLong(crypt[1]) == Long.parseLong(crypt[2]);
	}
}
