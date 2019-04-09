package com.leetcode.explore.primaryalgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arr7 {
	/*
	 * 	给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

		最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
		
		你可以假设除了整数 0 之外，这个整数不会以零开头。
		
		示例 1:
		
		输入: [1,2,3]
		输出: [1,2,4]
		解释: 输入数组表示数字 123。
		
		示例 2:
		
		输入: [4,3,2,1]
		输出: [4,3,2,2]
		解释: 输入数组表示数字 4321。


	 */
	public static void main(String args[]) {
		int[] a = { 9};
		a = plusOne(a);
		for(int c:a) {
			System.out.print(c);
		}
		//System.out.println( plusOne(a));
	}
	
	public static int[] plusOne(int[] digits) {
		int plus = 0;
		for(int i=digits.length-1;i>=0;i--) {
			if(plus == 1 || i==digits.length-1) {
				if( digits[i]+1 > 9) {
					digits[i] = digits[i]+1 -10;
					plus = 1;
					if(i == 0) {
						int[] e = new int[digits.length+1];
						e[0] =1;
						for(int j=1;j<digits.length+1;j++) {
							e[j] = 0;
						}
						return e;
					}
				}else {
					digits[i] = digits[i]+1 ;
					break;
				}
			}else {
				break;
			}
		}
	    return digits;
    }
}
