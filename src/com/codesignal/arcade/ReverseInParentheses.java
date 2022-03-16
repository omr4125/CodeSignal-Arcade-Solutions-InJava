package com.codesignal.arcade;

public class ReverseInParentheses {

	public static void main(String[] args) {
		String inpuString = "(((((asd)))))";
		System.out.println(new ReverseInParentheses().reverseInParentheses(inpuString));	
	}
	String reverseInParentheses(String str) {	
		StringBuilder sb;	
		String rev = null;	
		if (str.equals("")) return "";
		if (!str.contains("(")) return str;	
		do {
			
			String strFirst = str.substring(0, str.indexOf('('));
			String checkPar = str.substring(str.indexOf('('), str.indexOf(')')+1);
			String strLast = str.substring(str.indexOf(')') + 1);
			sb = new StringBuilder(checkPar.substring(checkPar.lastIndexOf('(')+1, checkPar.indexOf(')')));				
			rev = String.valueOf(sb.reverse());
			checkPar = checkPar.substring(0, checkPar.lastIndexOf('(')) + rev;
			str = strFirst + checkPar + strLast;
		} while (str.contains("("));
		return str; 
	}
}
