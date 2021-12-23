package com.codesignal.arcade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DeleteDigit {

	public static void main(String[] args) {
		System.out.println(solution(1234));
	}
	public static int solution(int n) {
		String s = String.valueOf(n);
		List<Integer>list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			
			String ss = s.substring(0, i) +s.substring(i + 1);
			list.add(Integer.valueOf(ss));
			
		}
		Collections.sort(list);
		System.out.println(list);
		return list.get(list.size()-1);
	}
}
