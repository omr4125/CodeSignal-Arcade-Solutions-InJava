package com.codesignal.arcade;

public class ArrayChange {

	public static void main(String[] args) {

		int[] inputArray = {-1000, 0, -2, 0};
		
		int counter = 0, subt = 0;
	    for(int i = 0; i < inputArray.length - 1; i++){
		    if(inputArray[i] >= inputArray[i+1]){
	            subt = Math.abs(inputArray[i] - inputArray[i+1]) + 1;
	            inputArray[i+1] += subt;
		        counter += subt;	        
		    }
		}
	    System.out.println(counter);
	}

}
