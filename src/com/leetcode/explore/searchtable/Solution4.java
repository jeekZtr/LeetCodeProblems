package com.leetcode.explore.searchtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution4 {

    public static void main(String[] args) {
    	Solution4 s = new Solution4();
    	System.out.println(s.frequencySort("Aabb"));
    }
    /**
     *     根据字符出现频率排序

			给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
			
			示例 1:
			
			输入:
			"tree"
			输出:
			"eert"
			
			解释:
			'e'出现两次，'r'和't'都只出现一次。
			因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
			
			示例 2:
			
			输入:
			"cccaaa"
			输出:
			"cccaaa"
			
			解释:
			'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
			注意"cacaca"是不正确的，因为相同的字母必须放在一起。
			
			示例 3:
			
			输入:
			"Aabb"
			输出:
			"bbAa"
			
			解释:
			此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
			注意'A'和'a'被认为是两种不同的字符。

     * @param s
     * @return
     */
    public String frequencySort(String s) {
        int[] smap = new int[256];
        // 计数
        for(int i=0;i<s.length();i++){
            smap[s.charAt(i)] += 1 ;
        }
        StringBuffer sb = new StringBuffer();
        // 排序 把坐标排序
        for(int i=0;i<s.length();i++) {
        	int max = 0;
        	int maxIndex = -1;
        	for(int j=0;j<256;j++){
        		if(smap[j] >0 && smap[j] >max){
        			max = smap[j]; 
        			maxIndex = j;
        		}
        	}
        	while(maxIndex>0 && smap[maxIndex] >0) {
        		sb.append((char)maxIndex);
        		smap[maxIndex] -= 1;
        	}
        }
        return sb.toString();
        
    }
}
