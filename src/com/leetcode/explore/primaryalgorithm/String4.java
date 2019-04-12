package com.leetcode.explore.primaryalgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 	 有效的字母异位词
	给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
	
	示例 1:
	
	输入: s = "anagram", t = "nagaram"
	输出: true
	示例 2:
	
	输入: s = "rat", t = "car"
	输出: false
	说明:
	你可以假设字符串只包含小写字母。
	
	进阶:
	如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * @author zhngtr-mi
 *
 */
public class String4 {
	public static void main(String args[]) {
		String a = "";
	}
	public static boolean isAnagram_4ms(String s, String t) {
			if (s == null && t == null) return true;
	        if (s == null || t == null) return false; 
	        if (s.length() != t.length()) return false;
	        char[] ss = s.toCharArray();
	        char[] tt = t.toCharArray();
	        
	        int[] ans = new int[27];
	        for (int i=0;i<ss.length;i++) {
	            ans[ss[i] - 'a'] +=1;
	            ans[tt[i] - 'a'] -=1;
	        }
	        for(int i=0;i<=26;i++) {
	            if (ans[i]!=0) {
	                return false;
	            } 
	        }
	        return true;
	}
    public static boolean isAnagram(String s, String t) {
    	 boolean flag = true;
         if("".equals(t) && "".equals(s) ){
             return true;
         }
     	if(s== null || "".equals(s) || t== null || "".equals(t) ) {
     		return false;
     	}
     	if(s.length() != t.length() ) {
     		return false;
     	}
     	char[] d = s.toCharArray();
     	char[] y = t.toCharArray();
     	//int[] acsii = new int[26];  acsii码的计算不是很会
     	Map<Character,Integer> map = new HashMap<Character,Integer>();
     	for(int i=0;i<d.length;i++) {
     		if( map.get(d[i]) == null) {
     			map.put(d[i], 1);
     		}else {
     			map.put(d[i], map.get(d[i]) + 1);
     		}
     	}
     	Map<Character,Integer> map1 = new HashMap<Character,Integer>();
     	for(int i=0;i<y.length;i++) {
     		if( map1.get(y[i]) == null) {
     			map1.put(y[i], 1);
     		}else {
     			map1.put(y[i], map1.get(y[i]) + 1);
     		}
     	}
     	Set<Character> keyset = map.keySet();
     	
     	for(char h:keyset) {
     		System.out.println( map1.get(h) +"---"+ map.get(h));
     		if( map1.get(h) != map.get(h)) {
     			flag = false;
     		}
     	}
     	return flag;
    }
}
