
package com.leetcode.problems.problems_950;


/**
 * 
给定一个整数数组 A，对于每个整数 A[i]，我们可以选择任意 x 满足 -K <= x <= K，并将 x 加到 A[i] 中。
在此过程之后，我们得到一些数组 B。
返回 B 的最大值和 B 的最小值之间可能存在的最小差值。

示例 1：

输入：A = [1], K = 0
输出：0
解释：B = [1]
示例 2：

输入：A = [0,10], K = 2
输出：6
解释：B = [2,8]
示例 3：

输入：A = [1,3,6], K = 3
输出：0
解释：B = [3,3,3] 或 B = [4,4,4]
* date: 2019年5月13日 下午5:36:20 <br/>
*
* @author zhngtr-mi
 */
public class Solution908 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
    
    public int smallestRangeI(int[] A, int K) {
        if( A.length == 1) {return 0;}
        int dev = 0;
        int max = A[0],min = A[0];
        for(int a:A) {
            if(max < a ) {
                max = a;
            }
            if(min > a) {
                min = a;
            }
        }
        
        return max-min-2*K <0 ? 0:max-min-2*K;
    }
}

	