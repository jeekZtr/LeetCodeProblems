
package com.leetcode.problems.problems_950;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 
 按奇偶排序数组 II

给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
你可以返回任何满足上述条件的数组作为答案。

示例：
输入：[4,2,5,7]
输出：[4,5,2,7]
解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 

提示：

2 <= A.length <= 20000
A.length % 2 == 0
0 <= A[i] <= 1000
 
* date: 2019年5月13日 下午5:58:52 <br/>
*
* @author zhngtr-mi
 */
public class Solution922 {

    public static void main(String[] args) {
        int[] A = {3,4};
        
        System.out.println(0%2);
        
        long t = System.currentTimeMillis();
        System.out.println(Arrays.toString(sortArrayByParityII(A)));
        System.out.println(t-System.currentTimeMillis());
    }
    /**
      *                        错误方法
       *         查找问题的方式错误了 ;;;;;;错误的原因是 两个错误的值交换后,不一定是正确的 
       *            正确的查找方式是,  查找 偶数列错误的 和 奇数列 错误的 交换
    *
    * @author zhngtr-mi
    * @since 2019-05-13
     */
    public static int[] sortArrayByParityII_wrong(int[] A) {
        int left = 0 ;
        int right = A.length-1;
        Queue q1 = new LinkedList();
        Queue q2 = new LinkedList();
        
        while(left < right) {
            boolean swap = false;
            // 在左边找到第一不符合定义的数
            while(left < right && ((A[left]%2 == 0 && left%2 == 0) || (A[left]%2 == 1 && left%2 == 1))) {
               //System.out.println("left  "+ left + "  val--" + A[left]);
                swap = true;
                left++;
            }
            System.out.println("left  "+ left + "  val--" + A[left]);
            // 在右边找到第一不符合定义的数
            while( left<right && ( (A[right]%2 == 0 && right%2 == 0) || (A[right]%2 == 1 && right%2 == 1))) {
                swap = true;
                right--;
            }
            System.out.println("right  "+ right + "  val--" + A[right]);
            System.out.println("right  "+ right + "  val--" + A[right]);
            System.out.println("swap--" + swap);
            System.out.println("========================================");
            //然后交换位置 ,  错误的原因是 两个错误的值交换后,不一定是正确的    
            if(swap && left<right ) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp; 
            }
            // 移动坐标
            left++;
            right--;
        }
        return A;
    }
    
    public static int[] sortArrayByParityII(int[] A) {
        int left = 0 ;
        int right = 1;
        
        while(left < A.length && right<A.length) {
            boolean swap = false;
            // 在奇数列 找到第一不符合定义的数
            while(left < A.length && A[left]%2 == 0 && left%2 == 0) {
               //System.out.println("left  "+ left + "  val--" + A[left]);
                left+=2;
            }
            // 在偶数列找到第一不符合定义的数
            while( right< A.length && A[right]%2 == 1 && right%2 == 1 ) {
                right+=2;
            }
            System.out.println("left  "+ left + "  val--" + A[left]);
            System.out.println("right  "+ right + "  val--" + A[right]);
            System.out.println("swap--" + swap);
            System.out.println("========================================");
            //然后交换位置 ,  错误的原因是 两个错误的值交换后,不一定是正确的    
            if(right< A.length &&left < A.length  ) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp; 
            }
            // 移动坐标
            left+=2;
            right+=2;
        }
        return A;
    }
}

	