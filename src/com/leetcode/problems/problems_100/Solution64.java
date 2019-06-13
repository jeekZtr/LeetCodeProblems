package com.leetcode.problems.problems_100;

import java.math.BigDecimal;
import java.util.Arrays;

public class Solution64 {
	 public static void main(String[] args) throws InterruptedException {
       int[][] a = {
                    {1,3,1},
                    {1,5,1},
                    {4,2,1}
                   };
		 
		 System.out.println("asdfasdf   "+  minPathSum(a) );    
		 for(int[] b:a) {
			 System.out.println(Arrays.toString(b));
		 }
		 
		 //A(5,5);
	 }
	 public static int minPathSum(int[][] grid) throws InterruptedException {
	        int i = 0;
	        int j = 0;
	        int R = grid.length;
	        int C = grid[0].length;
	        int sum =  grid[0][0];
	        while(i < R || j < C){
	            int temp =0;
	            if(i+1 <R && j+1< C){
	                if( grid[i+1][j] > grid[i][j+1] ) {
	                    temp = grid[i][++j];
	                }else {
	                	temp = grid[++i][j];
	                }
	            }else if( i+1 <R){
	            	temp = grid[++i][j];
	            	
	            }else if( j+1 <C){
	            	temp = grid[i][++j];
	            }else {
	            	break;
	            }
	            System.out.println( " temp+ " +temp);
	            
	            sum += temp;
	        }
	        return sum;
	    }
}
