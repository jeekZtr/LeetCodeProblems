package com.leetcode.problems.problems_050;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * 	无重复字符的最长子串
 * 
	 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
	示例 1:
	
	输入: "abcabcbb"
	输出: 3 
	解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
	
	示例 2:
	输入: "bbbbb"
	输出: 1
	解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
	
	示例 3:
	输入: "pwwkew"
	输出: 3
	解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
	     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */

public class Solution03 {

	public static void main(String[] args) {
//		System.out.println(lengthOfLongestSubstring("abcabcbb"));
// System.out.println(lengthOfLongestSubstring(" ")); // 输出 0 错误了 
System.out.println(lengthOfLongestSubstring("dv1234ddf"));  // 输出2 错误了 
	}

	public static int lengthOfLongestSubstring(String s) {
        int sum = 0;
        LinkedHashSet<Character> set = new LinkedHashSet();
        for(char c:s.toCharArray()) {
        	if( !set.add(c) ) {
        		//set.clear();
        		deleteSet(set ,c);
        		set.add(c);
        	};
        	if(set.size() > sum) {
    			sum =set.size(); 
    		}
        }
        
        return sum;
    }
	
	public static void deleteSet(Set set ,Character cc) {
		 Iterator<Character> it = set.iterator();  
         while(it.hasNext()){  
        	Character c = it.next();  
        	it.remove();  
            if(c==cc){  
            	break;
            }  
         }  
	}
	
//	dvdf 输出2 的错误版本
//	public static int lengthOfLongestSubstring(String s) {
//		int sum = 0;
//		Set<Character> set = new HashSet();
//		for(char c:s.toCharArray()) {
//			if( !set.add(c) ) {
//				set.clear();
//				set.add(c);
//			};
//			if(set.size() > sum) {
//				sum =set.size(); 
//			}
//		}
//		
//		return sum;
//	}
}
