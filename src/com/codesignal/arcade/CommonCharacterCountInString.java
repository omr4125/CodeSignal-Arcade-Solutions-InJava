package com.codesignal.arcade;

public class CommonCharacterCountInString {

	public static void main(String[] args) {

		String s1 = "aabcc", s2 = "adcaa"; 
		System.out.println("---------------");
		int counter = 0;
	    for(int i = 0; i < s1.length(); i++){
	        if(s2.contains(String.valueOf(s1.charAt(i)))){
	            counter++;
	            s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
	        }
	    }
	    System.out.println(counter);
	}
}
