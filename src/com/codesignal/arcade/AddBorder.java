package com.codesignal.arcade;

import java.util.Arrays;
import java.util.Iterator;

public class AddBorder {

	public static void main(String[] args) {
		String[] picture = { "abc","ded" };
		
		for (int i = 0; i < picture.length; i++) {
			picture[i] = "*" + picture[i] + "*";
			
		}
		String[] resultPicture = new String[picture.length + 2];
		String stars = "";
		
		for (int i = 0; i < picture[0].length(); i++) {
			stars += "*";			
		}
		resultPicture[0] = stars;
		resultPicture[resultPicture.length - 1] = stars;
		
		for (int i = 1; i < resultPicture.length - 1; i++) {
			resultPicture[i] = picture[i - 1];
			
		}
		
		System.out.println(Arrays.toString(resultPicture));
		
		int[] a = {1, 2, 2};
		int[] b = {2, 1, 2};
		
		System.out.println(Arrays.compare(a, b));
	}

}
