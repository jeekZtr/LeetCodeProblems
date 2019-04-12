package com.leetcode.explore.primaryalgorithm;

/**
 * 	整数反转
	给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
	
	示例 1:
	
	输入: 123
	输出: 321
	 示例 2:
	
	输入: -123
	输出: -321
	示例 3:
	
	输入: 120
	输出: 21
	注意:
	
	假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * @author zhngtr-mi
 *
 */
public class String2 {
	public static void main(String args[]) {
		System.out.println(reverse(-12));
		System.out.println(reverse(1000));
	}
	public static int reverse(int x) {
		String y = Integer.toString(x);
		y = y.replace("-", "");
		char[] s = y.toCharArray();
		char temp = 'a';
		int m = 0;
		try {
			for(int i=0;i<s.length/2;i++){
				temp = s[i];
				s[i] = s[s.length-i-1];
				s[s.length-i-1] = temp;
			}
			if(x >0) {
				String ss = "";
				for(char  a :s) {
					ss +=a;
				}
				m = Integer.parseInt(ss);
			}else {
				String ss = "-";
				for(char  a :s) {
					ss +=a;
				}
				m = Integer.parseInt(ss);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	    return m;
	}
}
