package com.leetcode.problems.problems_100;

import java.util.Arrays;

/**
 * 
 *   64. 最小路径和
 * 
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
说明：每次只能向下或者向右移动一步。

示例:
输入:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
输出: 7
解释: 因为路径 1→3→1→1→1 的总和最小。

 * 
*
* @author zhngtr-mi
 */
public class Solution64 {
    
    public static void main(String[] args) {
        int[][] a = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
               };
     
     System.out.println("asdfasdf   "+  minPathSum(a) );    
     for(int[] b:a) {
         System.out.println(Arrays.toString(b));
     }
    }
	 
	public static int  minPathSum(int[][] grid) {
	     int C = grid.length;
	     int R = grid[0].length;
	     int[][]  temp = new int[C][R];
	     for(int i=C-1;i>=0;i--) {
	         for(int j=R-1;j>=0;j--) {
	             if( (i == C-1) && (j == R-1) ) {
	                 temp[i][j] = grid[i][j];
	             }else {
	                 if(i == C-1) {
	                     temp[i][j] = grid[i][j] + temp[i][j+1];
	                 }else  if(j == R-1) {
	                     temp[i][j] = grid[i][j] + temp[i+1][j];
	                 }else {
	                     temp[i][j] = grid[i][j] +  Math.min( temp[i+1][j], temp[i][j+1] )  ;   
	                 }
	             }
	         } 
	     }
	     return  temp[0][0]; 
	}
}
