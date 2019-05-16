package com.leetcode.problems.problems_050;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution17 {

	public static void main(String[] args) {
	     //System.out.println(getString('8'));
	     System.out.println(Arrays.toString( letterCombinations("23").toArray()  ));

	}
	/**
	      给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
	      给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
	 * 
	 * 输入："23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	 * @param digits
	 * @return
	 */
	// dfs 的  深度优先 算法 ，，，， bfs 广度优先算法
	public static List<String> letterCombinations_dfs(String digits) {
		ArrayList<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return ans;
        }

        // 将digits字符串转换为int数组
        int[] digit  = new int[digits.length()];
        for(int i = 0; i < digits.length(); i++){
            digit[i] = digits.charAt(i) - '0';
        }
        
        // 调用DFS进行遍历
        combination_recursive(digit, 0, ans,new StringBuilder());
        return ans;
	}
	 private static void combination_recursive(int[] digit, int index, List<String> ans, StringBuilder temp){
        // 边界条件，
        // index超过数组长度，说明已经到达了最大深度，直接返回即可
        if(index == digit.length){
            ans.add(temp.toString());
            return;
        }
        // 获取这个数字对应的字符
        char[] list = numbers[digit[index]];
        // 进行深度优先搜索
        for(int i = 0; i < list.length; i++){
            combination_recursive(digit, index + 1, ans, new StringBuilder(temp.toString()).append(list[i]));
        }
    }
	public static char[][] numbers = {
            {},                // 0
            {},                // 1
            {'a','b','c'},     // 2
            {'d','e','f'},     // 3
            {'g','h','i'},     // 4
            {'j','k','l'},     // 5
            {'m','n','o'},     // 6
            {'p','q','r','s'}, // 7
            {'t','u','v'},     // 8
            {'w','x','y','z'}, // 9
    };

	// 最简单的  遍历算法
	public static List<String> letterCombinations(String digits) {
		List<String> ls = new ArrayList();
		if("1".equals(digits) || "".equals(digits) || digits==null){
			return ls;
		}
		for(int i=0;i<digits.length();i++) {
			String t = getString( digits.charAt(i) );
			if(ls.size() == 0) {
				for(int j=0;j<t.length();j++) {
					ls.add(t.charAt(j)+"");
				}
			}else {
				int len = ls.size();
//				List<String> temp = new ArrayList();
				for( int x=0;x<len;x++) {
					String xStr =ls.get(x); 
//					for(int j=0;j<t.length();j++) {
//						temp.add(xStr + t.charAt(j));	
//					}
					for(int j=1;j<t.length();j++) {
						ls.add(xStr + t.charAt(j));	
					}
					ls.set( x,xStr + t.charAt(0)) ;
				}
//				ls = temp;
			}
		}
		return ls;
	}
	
	public static String getString(char i) {
		switch(i){
		   case '2':
			   return "abc";
		   case '3':
			   return "def";
		   case '4':
			   return "ghi";
		   case '5':
			   return "jkl";   
		   case '6':
			   return "mno";
		   case '7':
			   return "pqrs";
		   case '8':
			   return "tuv";
		   case '9':
			   return "wxyz";	   
		   default : return "";
		
		}
		
	}
	
}
