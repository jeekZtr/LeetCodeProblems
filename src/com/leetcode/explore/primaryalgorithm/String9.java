package com.leetcode.explore.primaryalgorithm;

/**
 *  编写一个函数来查找字符串数组中的最长公共前缀。
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
	}

	 public static String longestCommonPrefix(String[] strs) {
		 if(strs == null  ) {
			 return "";
		 }
		 if(strs.length == 1 ||  "".equals(strs[0] )) {
			 return strs[0];
		 }
		 
		 for(int j=1;j<strs.length;j++) {
			 String str = strs[j];
			 for(int i=0;i< str.length()- strs[0].length()+1;i++) {
					String temp = str.substring(i,i+ strs[0].length());
					if(strs[0].equals(temp )) {
					}
			}
		 }
	     return "";
	}
}
