package com.codesignal.arcade;

public class FindEmailDomain {

	public static void main(String[] args) {
		System.out.println(solution("John.Smith@example.com"));
	}
	static String solution(String address) {
		
		return address.substring(address.lastIndexOf('@')+1);
	}
}
