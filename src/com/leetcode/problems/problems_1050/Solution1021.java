package com.leetcode.problems.problems_1050;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * 
 * @author zhang
 *
 */
public class Solution1021 {
	
	public static void main(String args[]) {
		System.out.println(removeOuterParentheses("((()())(()()))"));
	}
	/**
	 * 1021 删除最外层的括号
	 * @param S
	 * @return
	 */
    public static String removeOuterParentheses(String S) {
    	Stack st = new Stack();
    	List<Integer> list = new ArrayList();
        for(int i=0;i<S.length();i++){
            if('('== S.charAt(i) ) {
            	st.push(S.charAt(i));
            }else {
            	st.pop();
            }
            if(st.size() == 0) {
            	list.add(i);
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<list.size();i++) {
        	int start = i==0? 1: list.get(i-1)+2;
        	int end = list.get(i);
        	sb.append(S.substring(start, end));
        }
        
        return sb.toString();
    }
}
