package com.leetcode.explore.primaryalgorithm;

import java.util.Stack;

public class Others5 {
	
	/**
	 * 
	 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

		有效字符串需满足：
		
		    左括号必须用相同类型的右括号闭合。
		    左括号必须以正确的顺序闭合。
		
		注意空字符串可被认为是有效字符串。
		
		示例 1:
		输入: "()"
		输出: true
		示例 2:
		输入: "()[]{}"
		输出: true
		示例 3:
		输入: "(]"
		输出: false
		示例 4:
		输入: "([)]"
		输出: false
		示例 5:
		输入: "{[]}"
		输出: true
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		Stack s1 = new Stack();
		for(int i=0; i< s.length();i++ ) {
		    String str = s.charAt(i)+"";
		    System.out.println(str);
		    if("{".equals( str ) || "[".equals( str) || "(".equals( str ) ) {
		        s1.push(str);
		    }else {
		        if(s1.isEmpty()) {return false;}
		        if( "}".equals( str ) ) {
		            if(!"{".equals(s1.pop())) {return false;};   
		        } 
		        if( "]".equals( str ) ) {
		            if(!"[".equals(s1.pop())) {return false;};   
		        } 
		        if( ")".equals( str ) ) {
		            if(!"(".equals(s1.pop())) {return false;};   
		        } 
		    }
		    
		}
        return s1.isEmpty();
    }
	
	public static void main(String args[]) {
		System.out.println(isValid("()"));
	}
}
