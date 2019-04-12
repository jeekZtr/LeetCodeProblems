package com.leetcode.explore.primaryalgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 	 验证回文字符串
 * @author zhngtr-mi
 *
 */
public class String5 {
	public static void main(String args[]) {
		String a = "0P";
		System.out.println(isPalindrome(a));
	}
	public static boolean isPalindrome(String s) {
		 s = s.toLowerCase(); 
	        int startindex = 0 , endindex = s.length() -1;
	        while(startindex < endindex  && startindex < s.length() - 1 ) {
	        	char pre = s.charAt(startindex);
	        	char aft = s.charAt(endindex);
	        	System.out.println("12312---"+pre +"---"+aft+"--"+( ( pre >= 'a' && aft<='z') ||(pre >= '0' && aft<='9')) );
	    	    if(!( ( pre >= 'a' && pre<='z') ||(pre >= '0' && pre<='9')  ) ) {
	    	    	startindex++;
	    	    	continue;
	    	    }
	    	    if(!((aft >= 'a' && aft<='z') || (aft >= '0' && aft<='9')) ) {
	    	    	endindex--;
	    	    	continue;
	    	    }
	    	    System.out.println(pre +"---"+aft);
	    	    if(pre != aft) {
	    	    	return false;
	    	    }
	    	    startindex++;
	    	    endindex--;
	        }
			
			return true;       
	}
}
