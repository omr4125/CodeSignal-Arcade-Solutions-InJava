package com.codesignal.arcade;

public class LineEncoding {

	public static void main(String[] args) {
		String s = "aabbbc";
		String ss = s + " ";
		String sss = "";
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ss.charAt(i) != ss.charAt(i+1)) {
				if(counter >= 1) sss += counter+1;
				sss += ss.charAt(i);
				counter = 0;
			}else counter++;
		}
		System.out.println(sss);
	}
}
