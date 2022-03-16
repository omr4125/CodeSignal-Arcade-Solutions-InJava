package com.codesignal.arcade;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IsBeautifulString {

	public static void main(String[] args) {
		byte[] byteArray1 = "abcd".getBytes();
		System.out.println(Arrays.toString(byteArray1));
		
	}
static boolean solution(String inputString) {
	Map<Character, Integer> map = new HashMap<>();
	String[] str = inputString.split("");
	for (String s : str) {
		Integer numOfOccurence = map.get(s.charAt(0));
		if (numOfOccurence == null) {
			map.put(s.charAt(0), 1);
		}else {
			map.put(s.charAt(0), numOfOccurence + 1);
		}
	}
	Set keys = map.keySet();
	String letters =  keys.toString().replaceAll("\\W", "");
	for (int i = 0; i < letters.length(); i++) {
		char prev = (char) ((char)letters.charAt(i)-1);
		if (letters.charAt(i) == 'a') {
			prev = 'a';
		}
		if (  (map.get(prev) == null) || (map.get(letters.charAt(i)) > map.get(prev))  ) {
			return false;
		}
	}
	return true;
}
static boolean solution1(String s) {
    int [] c = new int[26];
    
    for (int i : s.getBytes()) c[i-'a'] ++;
    
    for (int i = 1; i < 26; i ++)
        if (c[i] > c[i-1]) return false;
    
    return true;
}
		
}
