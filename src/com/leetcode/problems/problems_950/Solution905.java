package com.leetcode.problems.problems_950;

import java.util.Arrays;

/**
 * 
         按奇偶排序数组
 * 
                 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
                
                你可以返回满足此条件的任何数组作为答案。
                
                示例：
                
                输入：[3,1,2,4]
                输出：[2,4,3,1]
                输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
                
                提示：
         1 <= A.length <= 5000
          0 <= A[i] <= 5000
 * 
 * ClassName: Solution905 <br/>
 * date: 2019年5月6日 下午3:48:14 <br/>
 *
 * @author zhngtr-mi
 */
public class Solution905 {
    
    /**
     * 
    *
    * @author zhngtr-mi
    * @since 2019-05-06
     */
    public static int[] sortArrayByParity(int[] A) {
        
        int left = 0;
        int right = A.length-1;
        while(left <= right ) {
            if(A[left]%2 != 0) {
                while( left <= right  ) {
                    if(A[right]%2 ==0) {
                       int temp = A[right];
                       A[right] = A[left];
                       A[left] = temp;
                       left++;
                       break; 
                    }
                    right--;
                    
                }
            }else {
                left ++;
            }
        }
        return A;
    }
    
    public static void main(String args[]) {
        int a[] = {};
        
        System.err.println(Arrays.toString(sortArrayByParity(a)));
        
    }
}

	