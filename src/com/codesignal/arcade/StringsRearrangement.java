package com.codesignal.arcade;

public class StringsRearrangement {
	public static void main(String[] args) {
		String[] inputArray = {"abc", 
				 "xbc", 
				 "xxc", 
				 "xbc", 
				 "aby", 
				 "ayy", 
				 "aby"};
		int numOfOne = 0, numOfNonOne = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i; j < inputArray.length - 1; j++) {
				System.out.print(inputArray[i] + "-" + inputArray[j+1] + "->" + findCountOfDifferChar(inputArray[i], inputArray[j+1]) + " ");
				
				if(findCountOfDifferChar(inputArray[i], inputArray[j+1]) == 1) {
					numOfOne++;
				}else if(findCountOfDifferChar(inputArray[i], inputArray[j+1]) > 2){
					numOfNonOne++;
				}
			}
			System.out.println();
		}
		System.out.println("numOfOne:" + numOfOne);
		System.out.println("numOfNonOne:" + numOfNonOne);
		System.out.println(numOfOne > numOfNonOne);
		
	}
	public static int findCountOfDifferChar(String s1, String s2) {
		int count = 0;
		s1 =  s1.toLowerCase();
		s2 =  s2.toLowerCase();
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				count++;
			}
		}
		
		return count;	
	}	
}
