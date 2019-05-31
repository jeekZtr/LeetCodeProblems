
package com.leetcode.problems.problems_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 78. 子集

                提交记录
                给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
                
                说明：解集不能包含重复的子集。
                
                示例:
                
                输入: nums = [1,2,3]
                输出:
                [
                  [3],
                  [1],
                  [2],
                  [1,2,3],
                  [1,3],
                  [2,3],
                  [1,2],
                  []
                ]
 * 
 * 
 */
public class Solution78 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list =  subsets(nums);
        for(List<Integer> ls :list) {
            System.out.println(Arrays.toString(ls.toArray()));
        }
          
//          String str = "111";
//          int zuheNums = Integer.parseInt(str,2);;
//          System.out.println(zuheNums);
            
    }
    
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>(); 
        int len = nums.length;
        String zuheStr = "";
        for(int i=0;i<len;i++) {
            zuheStr += 1+"";
        }
        int zuheNums = Integer.parseInt(zuheStr,2)+1 ;
        //System.out.println(zuheNums);
        //char[][] bin = new char[zuheNums][len];
        for(int i=0;i<zuheNums;i++) {
            String binv = Integer.toBinaryString(i);
            int bLen = binv.length();
            for(int j= 0 ;j<len-bLen;j++) {
                binv = "0"+binv;
            }
            System.out.println(binv);
            char[] cChar = binv.toCharArray();
            //bin[i] = cChar;
            List<Integer> ls = new ArrayList();
            for(int j= 0 ;j<len;j++) {
                if(cChar[j] != '0') {
                    ls.add(nums[j]);
                }
            }
            list.add(ls);
        }
        return  list;
    }  
}

	