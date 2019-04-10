package com.leetcode.explore.primaryalgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arr9 {
	/*
	 * 	给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

		你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
	 */
	public static void main(String args[]) {
		int[] a = { 0,0,3,0,0,5,1,0};
		twoSum(a ,10);
		for(int c:a) {
			System.out.print(c+",");
		}
		//System.out.println( plusOne(a));
	}
	
	public static int[] twoSum(int[] nums, int target) {
	    int[] ret = new int[2];
	    for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target ) {
					return new int[]{i,j};
				}
			}
		}
	    return ret;
	}
	public int[] twoSum_2ms(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];
            if (hash.containsKey(diff)) {
                return new int[]{hash.get(diff), i};
            } else {
                hash.put(nums[i], i);
            }
        }
        return null;
    }
	public int[] twoSum_5ms(int[] nums, int target) {
	    Map<Integer, Integer> hash = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int diff = target - nums[i];
	        if (hash.containsKey(diff)) {
	            return new int[] { hash.get(diff), i };
	        }
	        hash.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	/**
	 * todo 看不懂
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum_1(int[] nums, int target) {
        int max = 0xfff;
        int[] map = new int[max + 1];
        int index = 0, i;
        Arrays.fill(map, -1);
        for (i = 0; i < nums.length; i++) {
            index = (target - nums[i]) & max;
            if (map[index] != -1) {
                break;
            }
            map[nums[i] & max] = i;
        }
        return new int[]{map[index], i};
    }
}
