package com.leetcode.problems.problems_050;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Z 字形变换
 * 
 * 
 *         将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 
	比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
	
	L   C   I   R
	E T O E S I I G
	E   D   H   N
	
	之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
	
	请你实现这个将字符串进行指定行数变换的函数：
	
	string convert(string s, int numRows);
	
	示例 1:
	
	输入: s = "LEETCODEISHIRING", numRows = 3
	输出: "LCIRETOESIIGEDHN"
	
	示例 2:
	
	输入: s = "LEETCODEISHIRING", numRows = 4
	输出: "LDREOEIIECIHNTSG"
	解释:
	
	L     D     R
	E   O E   I I
	E C   I H   N
	T     S     G


 * 
 * @author zhang
 *
 */
public class Solution06 {

	public static void main(String[] args) {

	}

	public String convert(String s, int numRows) {
		if(s == null || s.length()==0) { return "";}
		char[] c  = s.toCharArray();
		int len = c.length;
		List<List<Character>> ls  = new ArrayList();
		List<Character> l = null; 
		int cure = 0; // 维护两个变量一个 第几个方框,  和 一个是上还是下 
		int vertor = 0; // 0 表示向下 . 1 表示斜向上
		for(int i=0;i<len;i++) {
			// 计算什么新建一列 , 
			// 新建 向下的列是 正好相等 . 新建斜上的列是  (2*numRows-2)*cure + numRows-1 < i <  (2*numRows-2)*(cure+1)
			if(  (2*numRows-2)*cure == i )  {
				l = new ArrayList();
				cure++;
				vertor = 0;
			}
			if( (2*numRows-2)*cure + numRows-1 <  i && i <  (2*numRows-2)*(cure+1)  ) {
				vertor = 1;
			}
			if( (2*numRows-2)*cure + numRows-1 >= i ) {
				l.add(c[i]);
			}else {
				l.add(' ');
			}
			ls.add(l);
		}
		
		// 遍历内容 生成字符串
		
		
		
		
		
		return "";
	}
}
