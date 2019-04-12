package com.leetcode.explore.primaryalgorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 	字符串中的第一个唯一字符
 * @author zhngtr-mi
 *
 */
public class String3 {
	public static void main(String args[]) {
		System.out.println(firstUniqChar_t("leetcode"));
	}
    public static int firstUniqChar(String s) {
        int index = -1;
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++) {
        	boolean falg = false;
        	for(int j=0;j<a.length;j++) {
        		if(i != j && a[i] == a[j]) {
        			falg = true;
        		}
        	}
        	if(!falg) {
        		return i;
        	}
        }
    	return index;
    }
    
    public static int firstUniqChar_t(String s) {
    	int index = -1;
    	Map<Character,Integer> map = new HashMap();
    	char[] a = s.toCharArray();
    	for(int i=0;i<a.length;i++) {
    		if( map.get(a[i]) != null ) {
    			map.put(a[i], map.get(a[i]) + 1 );
    		}else {
    			map.put(a[i], 1 );
    		}
    	}
    	for(int i=0;i<a.length;i++) {
    		if(map.get(a[i]) == 1) {
    			return i;
    		}
    	}	
    	return index;
    }
}
