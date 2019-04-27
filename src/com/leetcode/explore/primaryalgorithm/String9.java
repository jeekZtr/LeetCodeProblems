package com.leetcode.explore.primaryalgorithm;

import java.util.Arrays;

/**
 *  
 *  
 *  
      编写一个函数来查找字符串数组中的最长公共前缀。
	如果不存在公共前缀，返回空字符串 ""。
	示例 1:
	输入: ["flower","flow","flight"]
	输出: "fl"
	示例 2:
	输入: ["dog","racecar","car"]
	输出: ""
	解释: 输入不存在公共前缀。
	说明:
	所有输入只包含小写字母 a-z 。
 * 
 */
public class String9 {
	public static void main(String args[]) {
		String[] strs = {};
		System.out.println(longestCommonPrefix(strs));
	}

	 public static String longestCommonPrefix(String[] strs) {
		 if(strs == null  ) {
			 return "";
		 }
		 if(  strs.length == 0 ||  strs==null ||  "".equals(strs[0])  ) {
			 return "";
		 }
		 String str = strs[0];
		 
		 for(int i=0;i< str.length() ;i++) {
			 for(int j=1; j<strs.length; j++ ) {
				 	String str1 = strs[j];
					char temp = str.charAt(i);
					if(i>=str1.length()) {
						return str.substring(0, i);
					}
					char temp1 = str1.charAt(i);
					if(temp == temp1 ) {
					}else {
						return str.substring(0, i);
					}
			}
		 }
	     return str;
	}
}
