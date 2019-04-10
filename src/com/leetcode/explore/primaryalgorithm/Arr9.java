package com.leetcode.explore.primaryalgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arr9 {
	/*
	 * 	����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ

		����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
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
	 * todo ������
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
