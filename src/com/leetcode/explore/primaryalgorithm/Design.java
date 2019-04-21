package com.leetcode.explore.primaryalgorithm;

import java.util.Arrays;
import java.util.Random;

public class Design {
/**
 * 打乱一个没有重复元素的数组。

示例:

// 以数字集合 1, 2 和 3 初始化数组。
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
solution.shuffle();

// 重设数组到它的初始状态[1,2,3]。
solution.reset();

// 随机返回数组[1,2,3]打乱后的结果。
solution.shuffle();


 * @param args
 */
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		Design d = new Design(nums) ;
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.reset()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
		System.out.println(Arrays.toString(d.shuffle()));
	}
    static int[] nums;
    static int[] copy;
    static private Random rng = new Random();
	public Design(int[] nums) {
	        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums; 
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	copy = nums.clone();
    	for(int i=copy.length-1; i >=0 ;i--) {
    		int index1 = rng.nextInt(i + 1); // [0,n)
    		System.out.println(index1);
    		int temp = copy[i];
    		copy[i] = copy[index1];
    		copy[index1] = temp;
    	}
        return  copy;
    }
}
