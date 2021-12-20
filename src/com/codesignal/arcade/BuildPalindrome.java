package com.codesignal.arcade;

public class BuildPalindrome {

	public static void main(String[] args) {
		System.out.println(solution("cbdbedffcg"));

	}
	
	static String solution(String st) {
		StringBuilder sb = new StringBuilder(st);
		int len = st.length();
		if (st.equals(sb.reverse().toString())) {
			return st;
		}else {
			for (int i = 1; i < len; i++) {
				StringBuilder add = new StringBuilder(sb.substring(0, i));
				add.reverse();
				sb.append(add);
				st = sb.toString();
				String s2 = sb.reverse().toString();
				if (st.equals(s2)) {
					return st;
				}
				sb.reverse();
				sb.delete(sb.length()-add.length(), sb.length());
			}
		}
		return "";

	}
}
