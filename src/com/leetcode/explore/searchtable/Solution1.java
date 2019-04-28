package com.leetcode.explore.searchtable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution1 {

	public static void main(String[] args) {

	}
	/**
	 *  两个数组的交集

		给定两个数组，编写一个函数来计算它们的交集。
		
		示例 1:
		输入: nums1 = [1,2,2,1], nums2 = [2,2]
		输出: [2]
		
		示例 2:
		输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
		输出: [9,4]
		
		说明:
		    输出结果中的每个元素一定是唯一的。
		    我们可以不考虑输出结果的顺序。


				自己写的 时间复杂度O(3n);
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersection(int[] nums1, int[] nums2) {
		    Set set = new HashSet();
	        Set resset = new HashSet();
	        for(int i=0;i<nums1.length;i++){
	            set.add(nums1[i]);
	        }
	        if(set.size() == 0){
	            return new int[0];
	        }
	        for(int i=0;i<nums2.length;i++){
	            if(set.contains(nums2[i])){
	                resset.add(nums2[i]);
	            }
	        }
	        int[] res = new int[resset.size()];
			int i=0;
			for(Iterator it = resset.iterator();it.hasNext();i++){
				res[i] = (int) it.next();
			}
			return res;
    }

}
