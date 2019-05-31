package com.leetcode.problems.problems_050;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Solution22 {

	public static void main(String[] args) {
		long old = System.currentTimeMillis();
		System.out.println(Arrays.toString(generateParenthesis(3).toArray()));
		System.out.println(System.currentTimeMillis()-old);

	}
	public static List<String> generateParenthesis(int n) {
        List ls = new ArrayList();
        for(int i=0;i<n*2;i++) {
        	if(i==0) {
        		ls.add("(");
        		ls.add(")");
        	}else {
        		int size = ls.size();
        		for(int x=0;x<size;x++) {
        				ls.add(ls.get(x)+")");
        				ls.set(x ,ls.get(x)+"(");
        		}
        	}
        }
        // 判断是否是有效的括号 , 不是的话删除
        for(Iterator it = ls.iterator();it.hasNext();) {
        	String str = it.next()+"";
        	Stack st = new Stack();
        	for(int i=0;i<str.length();i++) {
        		if('(' == str.charAt(i) ) {
        			st.add('(');
        		}else {
        			if(st.isEmpty()) {
        				it.remove();
        				break;
        			}else {
        				st.pop();
        			}
        		}
        	}
        	if(!st.isEmpty()) {
        		it.remove();
        	}
        	st.clear();
        }
        
        return ls;
    }
}
