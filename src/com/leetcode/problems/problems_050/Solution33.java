package com.leetcode.problems.problems_050;

public class Solution33 {

	public static void main(String[] args) {
		int[] nums = {1,2};
		System.out.println(search(nums, 1));
	}

	public static int search(int[] nums, int target) {
		int len = nums.length;
		int l = 0;
		int h = len - 1;
		return bianrySer(nums, l, h, target);
	}
    /**
     * 		二分查找的一种利用方式
     * 
     * @param nums
     * @param l
     * @param h
     * @param target
     * @return
     */
	public static int bianrySer(int[] nums, int l, int h, int target) {
		if ( l > 0&& h < nums.length -1  && nums[l] == target) {
			return l;
		} else if ( 0< h && h < nums.length -1 && nums[h] == target) {
			return h;
		}
		if(l>=h) {
			return -1;
		}
		int mid = l + (h - l)/2;
		if (nums[mid] == target) {
			return mid;
		}
		if (nums[mid] < nums[h]) { // 说明 右方有序
			// 然后和 target 和 nums[mid] 和 nums[h] 判断是否在 这里,
			if (nums[mid] < target && nums[h] > target) {
				// 如果在? 继续在这侧搜索
				return bianrySer(nums, mid + 1, h, target);

			} else {
				// 如果不在 ? 去另一侧搜索
				System.out.println( mid - 1);
				return bianrySer(nums, l, mid - 1, target);
			}
		} else {
			// 这里有序

			// 如果 target 在这个范围?
			if (nums[l] < target && nums[mid] > target) {
				return bianrySer(nums, l, mid - 1, target);
			} else {
				return bianrySer(nums, mid + 1, h, target);
			}

		}
	}
}
