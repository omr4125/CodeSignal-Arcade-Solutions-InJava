package com.codesignal.arcade;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

	public static void main(String[] args) {
		
		String text = "Ready[[[, steady, go!";
		text = text.replaceAll("[^a-zA-Z]", " ");
		System.out.println(text);
		String[] arr = text.split(" ");
		System.out.println(Arrays.toString(arr));
		String str =  Arrays.stream(arr)
				.sorted(Comparator.comparing(String::length).reversed())
				.toList()
				.get(0)
				.toString();

		System.out.println(str);
	}
}