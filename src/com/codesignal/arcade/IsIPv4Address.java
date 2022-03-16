package com.codesignal.arcade;

public class IsIPv4Address {

	public static void main(String[] args) {
		
		String inputString = "200.0.3.00";
		
		System.out.println(new IsIPv4Address().isIPv4Address(inputString));
		
	}
	
	boolean isIPv4Address(String inputString) {
		String PATTERN = "^( ( 0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?) \\. )   {3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
		return inputString.matches(PATTERN);
	}
}
