package com.leetcode.problems.problems_1000;

import java.util.Arrays;

public class Solution977 {
	//有序数组的平方
	/**
	 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
			示例 1：
			输入：[-4,-1,0,3,10]
			输出：[0,1,9,16,100]
			
			示例 2：
			输入：[-7,-3,2,3,11]
			输出：[4,9,9,49,121]
			
			提示：
			    1 <= A.length <= 10000
			    -10000 <= A[i] <= 10000
			    A 已按非递减顺序排序。
	 */
	
	 public static int[] sortedSquares(int[] A) {
		for(int i=0;i<A.length;i++) {
			A[i] = A[i]*A[i];
		}
		Arrays.sort(A);
	    return A;
	 }
	 /**
	  * 
	  * 双指针

			思路
			
			因为数组 A 已经排好序了， 所以可以说数组中的负数已经按照平方值降序排好了，数组中的非负数已经按照平方值升序排好了。
			
			举一个例子，若给定数组为 [-3, -2, -1, 4, 5, 6]，数组中负数部分 [-3, -2, -1] 的平方为 [9, 4, 1]，
			数组中非负部分 [4, 5, 6] 的平方为 [16, 25, 36]。我们的策略就是从前向后遍历数组中的非负数部分，并且反向遍历数组中的负数部分。
			
			算法
			
			我们可以使用两个指针分别读取数组的非负部分与负数部分 —— 指针 i 反向读取负数部分，指针 j 正向读取非负数部分。
			
			那么，现在我们就在使用两个指针分别读取两个递增的数组了（按元素的平方排序）。接下来，我们可以使用双指针的技巧合并这两个数组。
	  * 
	  * @param A
	  * @return
	  */
	 public int[] sortedSquares_on(int[] A) {
	        int N = A.length;
	        int j = 0;
	        while (j < N && A[j] < 0)
	            j++;
	        int i = j-1;

	        int[] ans = new int[N];
	        int t = 0;

	        while (i >= 0 && j < N) {
	            if (A[i] * A[i] < A[j] * A[j]) {
	                ans[t++] = A[i] * A[i];
	                i--;
	            } else {
	                ans[t++] = A[j] * A[j];
	                j++;
	            }
	        }

	        while (i >= 0) {
	            ans[t++] = A[i] * A[i];
	            i--;
	        }
	        while (j < N) {
	            ans[t++] = A[j] * A[j];
	            j++;
	        }

	        return ans;
	    }
	 public static void main(String args[]){
		 int A[] = {-7,-3,2,3,11};
		 System.out.print(Arrays.toString(sortedSquares(A)));
	 }
}
