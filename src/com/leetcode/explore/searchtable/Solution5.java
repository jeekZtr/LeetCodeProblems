package com.leetcode.explore.searchtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution5 {

    public static void main(String[] args) {
    	Solution5 s = new Solution5();
    	
    }
    /**
     * 
     *  三数之和

		给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
		
		注意：答案中不可以包含重复的三元组。
		
		例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
		
		满足要求的三元组集合为：
		[
		  [-1, 0, 1],
		  [-1, -1, 2]
		]


     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
    	 Arrays.sort(nums);
         List<List<Integer>> outList = new ArrayList<List<Integer>>();
         for (int i = 0; i < nums.length; i++) {
             if ((i > 0 && nums[i] == nums[i - 1]) || nums[i]>=0 )  // 各循环起始点不需要判断重复
                 continue; // 不用i++ 的原因：避免最后的k还要增加边界判断，进入下一个循环则会自动边界判断“i < nums.length”
             for (int j = i + 1; j < nums.length; j++) {
                 if ((j > i + 1 && nums[j] == nums[j - 1])) 
                     continue; // 当有很多for和if的时候，条件取反后用continue，以此取代if的{}缩进，使代码可读性增加
                 for (int k = j + 1; k < nums.length; k++) {
                     if ((k > j + 1 && nums[k] == nums[k - 1]))
                         continue;
                     if ((nums[i] + nums[j] + nums[k] == 0)) {
                         List<Integer> inList = new ArrayList<Integer>();
                         inList.add(nums[i]);
                         inList.add(nums[j]);
                         inList.add(nums[k]);
                         outList.add(inList);
                         break;
                     }
                 }
             }
         }
         return outList;
    }
    
    /**
     * https://www.cnblogs.com/Xieyang-blog/p/8242900.html
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum_n2(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // 去掉重复的起点
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    result.add(Arrays.asList(new Integer[]{nums[i], nums[left], nums[right]}));
                    while (left < right && nums[left] == nums[left + 1])
                        left++; // 去掉重复的左点
                    while (left < right && nums[right] == nums[right - 1])
                        right--; // 去掉重复的右点
                    right--; // 进入下一组左右点判断
                    left++;
                } else if (sum > 0) {
                    right--; // sum>0 ,说明和过大了，需要变小，所以移动右边指针
                } else {
                    left++; // 同理，需要变大，移动左指针
                }
            }
        }
        return result;
    }
}
