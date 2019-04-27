package com.leetcode.explore.primaryalgorithm;

/**
 * 
 * 
 * 	报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
	1.     1
	2.     11
	3.     21
	4.     1211
	5.     111221
	
	1 被读作  "one 1"  ("一个一") , 即 11。
	11 被读作 "two 1s" ("两个一"）, 即 21。
	21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
	
	给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
	
	注意：整数顺序将表示为一个字符串。
 * 
 */
public class String8 {
	public static void main(String args[]) {
		System.out.println(countAndSay(30));
	}

	public static String countAndSay(int n) {
		if(n==1) {
			return "1";
		}
		String n1 = countAndSay(n-1);
		StringBuffer val = new StringBuffer();
		for(int i=0;i<n1.length();) {
			int size = 1;
			for(int j=i+1;j<n1.length();j++) {
				if(n1.charAt(i) == n1.charAt(j)) {
					size ++;
				}else {
					break;
				}
			}
			val.append(size+""+n1.charAt(i));
			i+=size;
		}
		return val.toString();
	}
}
