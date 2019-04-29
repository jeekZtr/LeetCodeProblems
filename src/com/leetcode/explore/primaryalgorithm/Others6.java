package com.leetcode.explore.primaryalgorithm;


public class Others6 {
    /**
     * 缺失数字
     * 
                    给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
                    
                    示例 1:
                    输入: [3,0,1]
                    输出: 2

                    示例 2:
                    输入: [9,6,4,2,3,5,7,0,1]
                    输出: 8
                    
                    说明:
                                你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
    *
    * @author zhngtr-mi
    * @since 2019-04-26
     */
    public static int missingNumber(int[] nums) {
        
        return  0;
    }	
    public static int missingNumber_1(int[] nums) {
        int res=nums.length;
        for(int i=0;i<nums.length;i++){
            res +=(i-nums[i]);
        }
        return res;
    }
	public static void main(String args[]) {
	    int[] nu = {9,6,4,2,3,5,7,0,1};
	    System.out.println(missingNumber_1(nu));
	}
}
