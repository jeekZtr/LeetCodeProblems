package com.leetcode.explore.searchtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution3 {

    public static void main(String[] args) {
    	
    	System.out.println(isIsomorphic("paper","title"));
    }
    /**
     *  
                    同构字符串
                                
                                    给定两个字符串 s 和 t，判断它们是否是同构的。
                                    
                                    如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
                                    
                                    所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
                                    
                                    示例 1:
                                    
                                    输入: s = "egg", t = "add"
                                    输出: true
                                    示例 2:
                                    
                                    输入: s = "foo", t = "bar"
                                    输出: false
                                    示例 3:
                                    
                                    输入: s = "paper", t = "title"
                                    输出: true
                                    说明:
                                    你可以假设 s 和 t 具有相同的长度。
    *
    * @author zhngtr-mi
    * @since 2019-04-29
     */
    public static boolean isIsomorphic(String s, String t) {
        
    	if(s == null || "".contentEquals(s)) {return false;}
    	
        int[] ss = new int[256];
        int[] tt = new int[256];
        int len = s.length(); 
        for(int i=0;i<len;i++) {
        	if(ss[s.charAt(i)] != tt[t.charAt(i)]) {return false;}
        	ss[s.charAt(i)] = i + 1;
        	tt[t.charAt(i)] = i + 1;
        }
        
        return  true;
    }
}
