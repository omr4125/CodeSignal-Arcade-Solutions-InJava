package com.codesignal.arcade;

import java.util.Arrays;
import java.util.Comparator;

public class AllLongestStrings {

	public static void main(String[] args) {
		String[] innputArray = {     "y", 
				  
				 "hot", 
				 "or", 
				 "not", 
				 "come", 
				 "on", 
				 "yooooooung",
				 "fire", 
				 "water", 
				 "watermelon"    };
		
		
		System.out.println(Arrays.toString(new AllLongestStrings().allLongestStrings(innputArray)));

	}
	String[] allLongestStrings(String[] inputArray) {

		String l = ""; //full string with "-" separator
	    
	    for( String s: inputArray )
	    {
	        if( l.indexOf("-") == s.length() ) {
	        	l += s + "-";
	        	
	        } else if ( l.indexOf("-") < s.length() ) {//reset if list has smaller strings
	        	
	        	l = s + "-"; 
	        }
	        
	    }	    
	    return l.split( "-" );
	}

}
