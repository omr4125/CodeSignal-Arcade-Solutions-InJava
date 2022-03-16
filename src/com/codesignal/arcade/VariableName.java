package com.codesignal.arcade;

public class VariableName {

	public static void main(String[] args) {
		String name = "qq-q";	
		System.out.println(name.matches("[a-zA-Z_][a-zA-Z0-9_]*"));	
		boolean b = false;
		for (int i = 0; i < name.length(); i++) {
					if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z'
						|| name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'
						|| name.charAt(i) >= '0' && name.charAt(i) <= '9'
						|| name.charAt(i) == '_') {
						b = true;
					}else {
						b = false;
						break;
					}
				}
		System.out.println( b && !(name.charAt(0) >= '0' && name.charAt(0) <= '9'));
		String inputString = "azz";
		String str = "";
	    for(int i = 0; i < inputString.length(); i++){
	        if(inputString.charAt(i) == 'z') {
	        	
	        	str = str + (char)(inputString.charAt(i)-25);
	        }else {
	        	 str = str + (char)(inputString.charAt(i) + 1);
			} 
	    }
	    System.out.println(str);	
	}
}
