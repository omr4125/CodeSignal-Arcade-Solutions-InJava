package com.codesignal.arcade;

public class MessageFromBinaryCode {

	public static void main(String[] args) {
		String code =     "01001000"
						+ "01100101"
						+ "01101100"
						+ "01101100"
						+ "01101111"
						+ "00100001";
		int N = code.length()/8;
		String codeEncode = "";
		for (int i = 0; i < N; i++) {
			codeEncode += Character.valueOf((char) Integer.parseInt(code.substring(0, 8), 2));
			code = code.substring(8);		
		}
		System.out.println(codeEncode);
	}
	
	
}
