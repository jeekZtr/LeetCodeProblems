package com.leetcode.problems.problems_1;

import java.util.Arrays;

/**
*
*       最接近的三数之和
* @author zhngtr-mi
*/
public class Solution16 {

    /**
    * @since 2019-05-15
    
    */
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest( nums, 1000));
    }
    
    /**
     * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
     * 使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
                   
                    例如，
                    给定数组 nums = [-1，2，1，-4], 和 target = 1.
                    与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
     * 
     */
    
    public static int threeSumClosest(int[] nums, int target) {
        int sum = Integer.MAX_VALUE;
        int res = 0;
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0;i< len;i++) {
            int l = i+1;
            int r = len-1;
            // 然后这里利用双指针  获得值
            while(l < r ) {
                 if(Math.abs(sum) > Math.abs( nums[l] + nums[r] + nums[i] - target )) {
                     sum = nums[l] + nums[r] + nums[i] - target ;
                     res = nums[l] + nums[r] + nums[i] ;
                 } ;
                 if( nums[l] + nums[r] + nums[i] - target == 0) {
                     res = nums[l] + nums[r] + nums[i] ;
                     break;
                 }
                 // 移动指针
                 if( nums[l] + nums[r] + nums[i] - target <0) {
                     l++;
                 }
                 if( nums[l] + nums[r] + nums[i] - target >0) {
                     r--;
                 }
            }
        }
        return res;
    }
    /**
     * 
     *   这是参考 别人的答案  稍微优化了一下代码. 提升时间8ms .. 
     *      减少了很多重复的操作..  直接利用了赋值.
    *
    * @author zhngtr-mi
    * @since 2019-05-15
     */
    public int threeSumClosest_tisheng8ms(int[] nums, int target) {
        int sum = Integer.MAX_VALUE;
        int res = 0;
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0;i< len;i++) {
            int l = i+1;
            int r = len-1;
            // 然后这里利用双指针  获得值
            while(l < r ) {
                 int temp =  nums[l] + nums[r] + nums[i];
                 if(Math.abs(sum) > Math.abs( temp - target )) {
                     sum = temp - target ;
                     res = temp ;
                 } ;
                 // 移动指针
                if( temp- target == 0) {
                     res = nums[l] + nums[r] + nums[i] ;
                     break;
                 }else
                 if( temp - target <0) {
                     l++;
                 }else
                 if( temp - target >0) {
                     r--;
                 }
                 
            }
        }
        return res;
    }
}

	