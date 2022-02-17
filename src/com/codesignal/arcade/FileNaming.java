package com.codesignal.arcade;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FileNaming {

	public static void main(String[] args) {
		String[] names = {"dd", 
				 "dd(1)", 
				 "dd(2)", 
				 "dd", 
				 "dd(1)", 
				 "dd(1)(2)", 
				 "dd(1)(1)", 
				 "dd", 
				 "dd(1)"};
		System.out.println(Arrays.toString(solution(names)));
		
		
	}
	public static Object[] solution(String[] names) {
		Set<String> set = new LinkedHashSet<>();
		
		for (String i : names) {
			if (!set.contains(i)) {
				set.add(i);
			}else {
				int k = 1;
				while (true) {
					if (set.contains(i + "(" + String.valueOf(k) + ")")) {
						k += 1;
					}else {
						set.add(i + "(" + String.valueOf(k) + ")");
						break;
					}
				}
			}
		}

//		System.out.println(set);
		return set.toArray();
	}
}
