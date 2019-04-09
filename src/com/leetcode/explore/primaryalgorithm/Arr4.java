package com.leetcode.explore.primaryalgorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * leetcode 的  217. 存在重复元素
 * @author zhang
 *
 */
public class Arr4 {

	public static void main(String args[]) {
		int[] a = { 7,3,2,1,2};

		System.out.println( containsDuplicate_4ms(a));
	}

	/**
	 * 使用不能存放相同数据的容器
	 * 
	 * @param nums
	 * @return
	 */

	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length < 1) {
			return false;
		}
		Set set = new HashSet();
		for (int a : nums) {
			set.add(a);
		}
		System.out.println(set.size());
		System.out.println(nums.length);
		if (set.size() < nums.length) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 先排序在做比较
	 * 
	 * @param nums
	 * @return
	 */

	public static boolean containsDuplicate_sort(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 数组中的每个元素的都和剩下的比较，如果相等则返回ture 最符合人类思考的方法
	 */
	public static boolean containsDuplicate_nature(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 那下个一个元素和 走过的元素比较大小
	 */
	public boolean containsDuplicate_jian(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = i; j > 0; j--) {
				if (nums[i] == nums[j - 1]) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 比较的时候做了一个排序？ 4ms的大神
	 * TODO
	 * @param nums
	 * @return
	 */
	public static boolean containsDuplicate_4ms(int[] nums) {
		if (nums.length < 2) {
			return false;
		}

		for (int i = 1; i < nums.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] > nums[j] && j + 1 != i) {
					int temp = nums[i];
					nums[i] = nums[j + 1];
					nums[j + 1] = temp;
					break;
				}
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * leetcode 的  217. 存在重复元素
	 * 2毫秒的大神
	 *  TODO
	 * @param nums
	 * @return
	 */

	public static boolean containsDuplicate_2ms(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			} else if (nums[i] == max) {
				return true;
			} else {
				for (int j = i - 1; j >= 0; j--) {
					if (nums[i] == nums[j]) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
